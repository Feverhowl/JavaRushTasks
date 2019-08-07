package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int all = fis.available();
        int spaces = 0;
        while (fis.available() > 0) {
            int ch = fis.read();
            if (ch == 32) spaces++;
        }
        fis.close();
        System.out.println(Math.round((double) spaces / (double) all * 100 * 100.0) / 100.0);
    }
}
