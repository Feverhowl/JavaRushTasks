package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fw = new BufferedWriter(new FileWriter(args[1]));
        while (fr.ready()) {
            String[] data = fr.readLine().split(" ");
            for (String s: data) {
                if ((s.replaceAll("\\D", "")).length() != 0) fw.write(s + " ");
            }
        }
        fr.close();
        fw.close();
    }
}
