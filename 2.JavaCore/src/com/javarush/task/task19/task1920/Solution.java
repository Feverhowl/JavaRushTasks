package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Считываем из файла данные и наполняем ими нашу хэшмапу:
        HashMap<String, Double> users = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while (br.ready()) {
                String[] data = br.readLine().split(" ");
                if (users.containsKey(data[0]))
                    users.replace(data[0], users.get(data[0]) + Double.parseDouble(data[1]));
                else users.put(data[0], Double.parseDouble(data[1]));
            }
        } catch (IOException e) { /* Nothing to do */ }

        // Вычисляем значение максимальной зарплаты из всех
        Double maxZP = Double.MIN_VALUE;
        for (Map.Entry e: users.entrySet()) {
            Double currentZP = (double)e.getValue();
            if (currentZP > maxZP) maxZP = currentZP;
        }

        // Составляем список людей, получающих максимальную зарплату
        List<String> richest = new ArrayList<>();
        for (Map.Entry e: users.entrySet()) {
            if ((double)e.getValue() == maxZP) richest.add(e.getKey().toString());
        }

        // Сортируем список людей с макс зарплатой по алфавиту
        Collections.sort(richest);

        // Выводим все это добро в консоль
        for (String s: richest) System.out.println(s);
    }
}
