package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = lower.toUpperCase();
        int count = 0;

        FileInputStream fis = new FileInputStream(args[0]);
        while(fis.available() > 0) {
            char ch = (char) fis.read();
            if (lower.indexOf(ch) > -1 || upper.indexOf(ch) > -1) count++;
        }
        fis.close();
        System.out.println(count);
    }
}
