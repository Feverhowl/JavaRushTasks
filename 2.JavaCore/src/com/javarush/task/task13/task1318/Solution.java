package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "1.txt";
        try { fileName = reader.readLine(); } catch (IOException e) { /* 0_0 */ }
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        try {
            inputStream = new FileInputStream(fileName);
            buffer = new BufferedInputStream(inputStream);
            while(buffer.available() > 0) {
                char c = (char)buffer.read();
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputStream.close();
            buffer.close();
            reader.close();
        } catch (IOException o) { /* 0_0 */ }
    }
}