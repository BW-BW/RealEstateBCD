/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalsignature;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;


/**
 *
 * @author Brian
 */
public class SignatureSign {
    private Signature sig;

    // Testing section (KeyPair)
    private KeyPair keyPair;

    // Get KeyPair from txt file
    public KeyPair getKeyPair(String data) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        // Read Public Key.
        File filePublicKey = new File("KeyPair/"+ data +"/PublicKey");
        FileInputStream fis = new FileInputStream("KeyPair/" + data + "/PublicKey");
        byte[] encodedPublicKey = new byte[(int) filePublicKey.length()];
        fis.read(encodedPublicKey);
        fis.close();

        // Read Private Key.
        File filePrivateKey = new File("KeyPair/" + data + "/PrivateKey");
        fis = new FileInputStream("KeyPair/" + data + "/PrivateKey");
        byte[] encodedPrivateKey = new byte[(int) filePrivateKey.length()];
        fis.read(encodedPrivateKey);
        fis.close();

        // Generate KeyPair.
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(
                encodedPublicKey);
        PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);

        PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(
                encodedPrivateKey);
        PrivateKey privateKey = keyFactory.generatePrivate(privateKeySpec);

        return new KeyPair(publicKey, privateKey);
    }
    // ===========================================================

    public SignatureSign(String data) {
        super();
        try {
            sig = Signature.getInstance("SHA256WithRSA");
            keyPair = getKeyPair(data);
        } catch (Exception e) {
            System.out.println("KeyPair Not Found");
        }
    }

    public String sign(String data) throws Exception {
    	try {
            sig.initSign(keyPair.getPrivate());
            sig.update(data.getBytes());			
            } catch (Exception e) {
                    System.out.println("KeyPair Not Found");
            }
        return Base64.getEncoder().encodeToString(sig.sign());
    }

    public boolean verify(String data, String signature){
    	boolean access = false;
    	try {
            sig.initVerify(keyPair.getPublic());
            sig.update(data.getBytes());
            sig.verify(Base64.getDecoder().decode(signature));
            access = true;

            } catch (Exception e) {
                    System.out.println("Not Found");
            }
    	return access;
    }    
}
