/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cryptography;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;

/**
 *
 * @author Brian
 */
public class Symmetric extends Cryptography{
    public Symmetric(String algorithm) {
        super(algorithm);
    }

    @Override
    public String encrypt(String data, Key key) throws Exception {
        String cipherText = null;
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherBytes = cipher.doFinal(data.getBytes());
        cipherText = Base64.getEncoder().encodeToString(cipherBytes);
        return cipherText;
    }

    @Override
    public String decrypt(String cipherText, Key key) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] cipherBytes = Base64.getDecoder().decode(cipherText);
        byte[] dataBytes = cipher.doFinal(cipherBytes);
        return new String(dataBytes);
    }
}
