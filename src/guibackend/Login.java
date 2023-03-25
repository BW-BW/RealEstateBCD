/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guibackend;

import cryptography.Cryptography;
import cryptography.Symmetric;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Brian
 */
public class Login {
    final private String Username;
    final private String Password;

    private Path filePath = Paths.get("Account.txt");

    public Login(String username, String password) {
        this.Username = username;
        this.Password = password;
    }

    public boolean login() {
        String accountdata = "";

        Boolean access = false;

        Cryptography decryptor = new Symmetric("AES");

        Key key = new SecretKeySpec(Arrays.copyOf(Password.getBytes(), 16), "AES");

        try {
            Scanner scanner = new Scanner(filePath);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(Username)) {
                    accountdata = line;
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Inccorect Username Password");
            return false;
        }

        String[] encrpytedData = accountdata.split(":");

        if (encrpytedData.length > 0) {
            String decryptedUsername = "";
            try {
                decryptedUsername = decryptor.decrypt(encrpytedData[0], key);
            } catch (Exception e) {
                return false;
            }
            if (decryptedUsername.equals(Username)) {
                return true;
            }
        }
        return false;
    }
}
    

