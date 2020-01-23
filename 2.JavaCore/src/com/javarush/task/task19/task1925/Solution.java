package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            String[] data = reader.readLine().split(" ");
            for (String s: data) if (s.length() > 6) sb.append(s).append(",");
        }
        reader.close();
        writer.write(sb.toString().substring(0, sb.toString().lastIndexOf(",")));
        writer.close();
    }
}
