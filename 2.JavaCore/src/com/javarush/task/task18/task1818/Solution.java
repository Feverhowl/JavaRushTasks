package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos1 = new FileOutputStream(reader.readLine(), true);
        FileInputStream fis2 = new FileInputStream(reader.readLine());
        FileInputStream fis3 = new FileInputStream(reader.readLine());

        while (fis2.available() > 0) {
            byte[] buffer = new byte[fis2.available()];
            fis2.read(buffer);
            fos1.write(buffer);
        }
        fis2.close();

        while (fis3.available() > 0) {
            byte[] buffer = new byte[fis3.available()];
            fis3.read(buffer);
            fos1.write(buffer);
        }
        fis3.close();
        fos1.close();
    }
}
