/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockchain;

import hashing.Hasher;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author Brian
 */
public class Block implements Serializable{
    public Header header;
    public PropertyData record;

    //constructor
    public Block( String prevHash, int index ) {
            header = new Header();
            header.setPreviousHash(prevHash);
            header.setIndex(index + 1);
            header.setTimestamp( new Timestamp( 
                            System.currentTimeMillis() ).getTime() );
            byte[] blockByte = this.getBytes();
            String currHash = new String(blockByte);
            String blockHash = Hasher.hash( currHash, "SHA-256" );
            header.setCurrentHash( blockHash );
    }

    public Header getHeader() {
            return header;
    }

    public PropertyData getData() {
            return record;
    }

    public void setData(PropertyData realEstateList) {
            this.record = realEstateList;
    }

    // nested class for composition relations
    public class Header implements Serializable{

            private int index;
            private String currentHash;
            private String previousHash;
            private long timestamp;

            public String getCurrentHash() {
                    return currentHash;
            }

            public void setCurrentHash(String currentHash) {
                    this.currentHash = currentHash;
            }

            public String getPreviousHash() {
                    return previousHash;
            }

            public void setPreviousHash(String previousHash) {
                    this.previousHash = previousHash;
            }

            public long getTimestamp() {
                    return timestamp;
            }

            public void setTimestamp(long timestamp) {
                    this.timestamp = timestamp;
            }

            public int getIndex() {
                    return index;
            }

            public void setIndex(int index) {
                    this.index = index;
            }

            @Override
            public String toString() {
                    StringBuilder sb = new StringBuilder("Header [");
                    sb.append( "index="+this.index+", " );
                    sb.append( "currentHash="+this.currentHash+", " );
                    sb.append( "previousHash="+this.previousHash+", " );
                    sb.append( "timestamp="+this.timestamp+", " );
                    return sb.append("]").toString();
            }

    }

    @Override
    public String toString() {
            return "Block [header="+ this.header +", transaction="+ this.record +"]";
    }

    /**
     * Converting the Block object into byte[]
     */
    private byte[] getBytes() {
            try(
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ObjectOutputStream out = new ObjectOutputStream(baos);
            ) {

                    out.writeObject( this );
                    return baos.toByteArray();

            } catch (Exception e) {
                    e.printStackTrace();
                    return null;
            }
    }
}
