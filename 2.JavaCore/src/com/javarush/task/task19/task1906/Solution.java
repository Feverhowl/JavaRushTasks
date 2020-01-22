package com.javarush.task.task19.task1906;

/* 
Четные символы
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
            FileReader fr = new FileReader(firstFileName);
            FileWriter fw = new FileWriter(secondFileName);
            int counter = 1;
            while (fr.ready()) {
                int data = fr.read();
                if (counter % 2 == 0) fw.write(data);
                counter++;
            }
            fr.close();
            fw.close();
        } catch (IOException e) { /* Nothing to do */ }
    }
}
