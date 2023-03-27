/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockchain;

import com.google.gson.GsonBuilder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;

/**
 *
 * @author Brian
 */
public class Blockchain {
    //create the blockhain file - unreadable by people
    private static final String CHAIN_FILE = "master/chain.bin";

    private static LinkedList<Block> DB = new LinkedList<>();

    //create ledger file for user to read
    private static final String LEDGER_FILE = "ledger.txt";

    public static void genesis() {
        Block genesis = new Block("0", -1);
        DB.add(genesis);
        Blockchain.persist();
        Blockchain.distribute();
    }

    public static void nextBlock(Block newBlock) {
        DB = get();
        DB.add(newBlock);
        Blockchain.persist();
    }

    private static void persist() {
        try (
            FileOutputStream fout = new FileOutputStream(CHAIN_FILE);
            ObjectOutputStream out = new ObjectOutputStream(fout);) {
            out.writeObject(DB);
            System.out.println(">>> Master file updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LinkedList<Block> get() {
        try (
            FileInputStream fin = new FileInputStream(CHAIN_FILE);
            ObjectInputStream in = new ObjectInputStream(fin);) {
            return (LinkedList<Block>) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void distribute() {
        
        String chain = new GsonBuilder().setPrettyPrinting().create().toJson(DB);
        System.out.println(chain);
        try {
            Files.write(Paths.get(LEDGER_FILE), chain.getBytes(), StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
