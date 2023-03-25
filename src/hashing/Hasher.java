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
    public static String md5(String data) {
            return hash(data, "MD5");
    }

    //sha256(String) : String
    public static String sha256(String data) {
            return hash(data, "SHA-256");
    }

    // sha384(String) : String
    public static String sha384(String data) {
            return hash(data, "SHA-384");
    }

    //sha512(String) : String
    public static String sha512(String data) {
            return hash(data, "SHA-512");
    }
    
    public static String hash(String data, String algo) 
    {
        String hash = null;
        try {
                //instantiate MessageDigest object
                MessageDigest md = MessageDigest.getInstance( algo );
                //fetch data in byte arr to the MessageDigest
                md.update( data.getBytes() );
                //added security value in standard way
                //md.update("minebCd-l@b6".getBytes());
                //added security value using salt
                md.update( Salt.generate() );
                //generate the hash bytes from MessageDigest
                byte[] hashByte = md.digest();

                //convert byte[] to String
                //1) Base64
                //hash = Base64.getEncoder().encodeToString(hashByte);

                //2) Hex format - recommended!
                //source: https://commons.apache.org/proper/commons-codec/download_codec.cgi
                hash = String.valueOf( Hex.encodeHex(hashByte) );

        } catch (Exception e) {
                e.printStackTrace();
        }
        return hash;
    }
}
