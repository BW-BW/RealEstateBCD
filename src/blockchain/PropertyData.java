/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockchain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brian
 */
public class PropertyData implements Serializable{
    private final int SIZE = 8;
    //MerkleRoot is a hash value according to dataLst
    //  Note: we will do that later on
    private String merkleRoot = "helloworld";


    //You may want to choose any data collection mechanism
    // 	Simply, array or collection APIs
    private List<String> dataLst;

    //constructor
    public PropertyData() {
        dataLst = new ArrayList<>( SIZE );
    }

    public void setMerkleTree(String root) {
        this.merkleRoot = root;
    }

    //add-operation
    public void add( String tranx ) {
        dataLst.add(tranx);
    }

    @Override
    public String toString() {
        return "Transaction ["+ dataLst +"]";
    } 

    public List<String> getDataLst() {
        return dataLst;
    }
}
