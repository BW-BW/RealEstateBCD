/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashing;

import java.security.SecureRandom;

/**
 *
 * @author Brian
 */
public class Salt {
    public static byte[] generate() {
        //creating rand value...
        SecureRandom sr = new SecureRandom();
        byte[] b = new byte[16];
        sr.nextBytes(b);
        return b;
    }
}
