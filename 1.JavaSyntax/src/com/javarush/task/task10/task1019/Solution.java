package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Мой код
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String ids = reader.readLine();
            if ("".equals(ids)) break;
            int id = Integer.parseInt(ids);
            String name = reader.readLine();
            map.put(name, id);
            if ("".equals(name)) break;
        }
        for (HashMap.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
