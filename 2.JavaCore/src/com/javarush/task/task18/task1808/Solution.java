package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis1 = new FileInputStream(reader.readLine());
        FileOutputStream fos2 = new FileOutputStream(reader.readLine());
        FileOutputStream fos3 = new FileOutputStream(reader.readLine());

        int bytesToSecondFile;
        if (fis1.available() % 2 == 0) bytesToSecondFile = fis1.available() / 2;
        else bytesToSecondFile = 1 + fis1.available() / 2;
        byte[] buffer = new byte[bytesToSecondFile];

        while (fis1.available() > 0) {
            int count = fis1.read(buffer);
            fos2.write(buffer, 0, count);
            count = fis1.read(buffer);
            fos3.write(buffer, 0, count);
        }

        fis1.close();
        fos2.close();
        fos3.close();
    }
}
