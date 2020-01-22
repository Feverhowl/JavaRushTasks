package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String firstFileName = "";
        String secondFileName = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) { /* Nothing to do */ }

        try {
            BufferedReader fr = new BufferedReader(new FileReader(firstFileName));
            BufferedWriter fw = new BufferedWriter(new FileWriter(secondFileName));
            while (fr.ready()) {
                String line = fr.readLine();
                fw.write(line.replaceAll("\\p{Punct}", ""));
            }
            fr.close();
            fw.close();
        } catch (IOException e) { /* Nothing to do */ }
    }
}
