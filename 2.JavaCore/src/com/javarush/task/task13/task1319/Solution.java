package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        try {
            File file = new File(reader.readLine());
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            while (true) {
                String line = reader.readLine();
                list.add(line);
                if ("exit".equals(line)) break;
            }
            for (String s: list) { writer.write(s + "\n"); }
            reader.close();
            writer.close();
        } catch (IOException e1) { e1.printStackTrace(); }
    }
}
