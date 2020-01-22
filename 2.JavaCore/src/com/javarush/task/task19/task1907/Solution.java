package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String fileName = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException e) { /* Nothing to do */ }

        int counter = 0;
        String word = "world";
        try {
            BufferedReader fr = new BufferedReader (new FileReader(fileName));
            while (fr.ready()) {
                String line = fr.readLine();
                String[] words = line.split("\\W");
                for (String s: words) {
                    if (s.equals(word)) counter++;
                }
            }
            fr.close();
        } catch (IOException e) { /* Nothing to do */ }

        System.out.println(counter);
    }
}
