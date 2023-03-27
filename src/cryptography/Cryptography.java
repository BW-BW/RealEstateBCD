/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cryptography;

import java.security.Key;
import javax.crypto.Cipher;

/**
 *
 * @author Brian
 */
public abstract class Cryptography {
    protected Cipher cipher;

    public Cryptography( String algorithm ) {
        try {
            cipher = Cipher.getInstance( algorithm );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Funtion will be written in the child class
    public abstract String encrypt(String data, Key key) throws Exception; 
    public abstract String decrypt(String cipherText, Key key) throws Exception;    
}
