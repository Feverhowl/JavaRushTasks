package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);
        ArrayList<Integer> list = new ArrayList<>();

        while (fis2.available() > 0) {
            list.add(fis2.read());
        }
        fis2.close();

        while (fis.available() > 0) {
            list.add(fis.read());
        }
        fis.close();

        FileOutputStream fos = new FileOutputStream(file1);

        for (Integer in: list) {
            fos.write(in);
        }
        fos.close();
    }
}
