package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        crypt(args[0], args[1], args[2]);
    }

    private static void crypt(String type, String fileName, String fileOutputName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            FileOutputStream fos = new FileOutputStream(fileOutputName);
            while(fis.available() > 0) {
                char ch = (char) fis.read();
                char encrypted;
                if (ch == 10) encrypted = ch;
                else if (type.equals("-e")) encrypted = (char)((int)ch + 1);
                else if (type.equals("-d")) encrypted = (char)((int)ch - 1);
                else {
                    System.out.println("Unknown command!");
                    break;
                }
                fos.write(encrypted);
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
