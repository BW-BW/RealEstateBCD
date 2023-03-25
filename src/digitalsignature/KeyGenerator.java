/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalsignature;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
     * create()
     */
    public static void create(String path) {

        KeyGenerator myKeyMaker = new KeyGenerator();
        // generate keypair
        myKeyMaker.keyPair = myKeyMaker.keygen.generateKeyPair();
        // get public key
        PublicKey pubKey = myKeyMaker.keyPair.getPublic();
        // get private key
        PrivateKey prvKey = myKeyMaker.keyPair.getPrivate();

        // view
        System.out.println("Public Key: " + Base64.getEncoder().encodeToString(pubKey.getEncoded()));
        System.out.println("Private Key: " + Base64.getEncoder().encodeToString(prvKey.getEncoded()));

        // put
        put(pubKey.getEncoded(), "KeyPair/" + path + "/PublicKey");
        put(prvKey.getEncoded(), "KeyPair/" + path + "/PrivateKey");

    }

    /*
     * put( byte[], String )
     */
    private static void put(byte[] keyBytes, String path) {
        File file = new File(path);
        file.getParentFile().mkdirs();
        try {
            Files.write(Paths.get(path), keyBytes, StandardOpenOption.CREATE);
            System.out.println("Done...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
