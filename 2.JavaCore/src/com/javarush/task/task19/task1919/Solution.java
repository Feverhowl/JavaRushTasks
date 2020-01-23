package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> users = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while (br.ready()) {
                String[] data = br.readLine().split(" ");
                if (users.containsKey(data[0])) {
                    users.replace(data[0], users.get(data[0]) + Double.parseDouble(data[1]));
                }
                else users.put(data[0], Double.parseDouble(data[1]));
            }
        } catch (IOException e) { /* Nothing to do */ }

        for(Map.Entry e : users.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
