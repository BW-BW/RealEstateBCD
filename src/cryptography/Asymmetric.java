/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cryptography;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;
/**
 *
 * @author Brian
 */
public class Asymmetric extends Cryptography{
    public Asymmetric(String algorithm) {
        super(algorithm);
    }

    @Override
    public String encrypt(String data, Key key) throws Exception {
        String cipherText = null;
        //init
        cipher.init(Cipher.ENCRYPT_MODE, (PublicKey) key);
        //encrypt for the cipher text
        byte[] cipherBytes = cipher.doFinal( data.getBytes() );
        //convert to String
        cipherText = Base64.getEncoder().encodeToString(cipherBytes);
        return cipherText;
    }

    @Override
    public String decrypt(String cipherText, Key key) throws Exception {
        //init
        cipher.init(Cipher.DECRYPT_MODE, (PrivateKey) key);
        //convert to byte[]
        byte[] cipherBytes = Base64.getDecoder().decode( cipherText );
        //decrypt
        byte[] dataBytes = cipher.doFinal( cipherBytes );
        return new String( dataBytes );
    }
}
