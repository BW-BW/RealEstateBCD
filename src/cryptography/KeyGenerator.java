/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cryptography;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 *
 * @author Brian
 */
public class KeyGenerator {
    private KeyPairGenerator keygen;
    private KeyPair keyPair;

    public KeyGenerator() {
        try {
            keygen = KeyPairGenerator.getInstance("RSA");
            keygen.initialize(1024);
        } catch (NoSuchAlgorithmException e) {
        }
        
    }
    
    private static void placeDirectory(byte[] keyBytes, String path) {
        File file = new File(path);
        file.getParentFile().mkdirs();
        try {
            Files.write(Paths.get(path), keyBytes, StandardOpenOption.CREATE);
        } catch (IOException e) {
        }
    }

    public static void create(String path) {
        KeyGenerator myKeyMaker = new KeyGenerator();
        // generate keypair
        myKeyMaker.keyPair = myKeyMaker.keygen.generateKeyPair();
        // generate public key
        PublicKey pubKey = myKeyMaker.keyPair.getPublic();
        // generate private key
        PrivateKey prvKey = myKeyMaker.keyPair.getPrivate();

        //place it into the folder
        placeDirectory(pubKey.getEncoded(), "KeyPair/" + path + "/PublicKey");
        placeDirectory(prvKey.getEncoded(), "KeyPair/" + path + "/PrivateKey");
    }

    
}
