/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing;

import java.security.MessageDigest;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author Brian
 */
public class Hasher {
    public static String sha256(String data) {
            return hash(data, "SHA-256");
    }
    
    public static String hash(String data, String algo) 
    {
        String hash = null;
        try {
            MessageDigest md = MessageDigest.getInstance( algo );
            md.update( data.getBytes() );

            //use salt to add security
            md.update( Salt.generate() );
            
            //get the byte array value
            byte[] hashByte = md.digest();

            hash = String.valueOf( Hex.encodeHex(hashByte) );

        } catch (Exception e) {
                e.printStackTrace();
        }
        return hash;
    }
}
