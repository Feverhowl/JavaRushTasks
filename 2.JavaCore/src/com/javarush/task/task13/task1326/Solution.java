package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File(reader.readLine());
            FileInputStream fis = new FileInputStream(file);
            while (fis.available() > 0) {
                char ch = (char) fis.read();
                if (ch == System.lineSeparator().charAt(0)) {
                    list.add(Integer.parseInt(sb.toString()));
                    sb.setLength(0);
                } else {
                    sb.append(ch);
                }
            }
            reader.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        for (Integer in: list) {
            if (in % 2 == 0) System.out.println(in);
        }
    }
}
