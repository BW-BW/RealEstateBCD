/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guibackend;

import cryptography.Cryptography;
import cryptography.Symmetric;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.Key;
import java.util.Arrays;
import java.util.Scanner;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class Register {
    private String Username;
    private String Password;

    private Path filePath = Paths.get("Accounts.txt");

    public Register(String username, String password) {
        this.Username = username;
        this.Password = password;
    }

    public boolean registerAccount() throws Exception {
        Key key = new SecretKeySpec(Arrays.copyOf(Password.getBytes(), 16), "AES");
        Cryptography encryptor = new Symmetric("AES");
        String encryptedText = encryptor.encrypt(Username, key);

        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!checkUsername(Username)) {
            Files.write(filePath, (encryptedText + ":" + Username + "\n").getBytes(), StandardOpenOption.APPEND);
            return true;
        }
        return false;
    }

    private boolean checkUsername(String username) {
        boolean check = false;
        try {
            Scanner scanner = new Scanner(filePath);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(username)) {
                    check = true;
                }
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return check;
    }
}
