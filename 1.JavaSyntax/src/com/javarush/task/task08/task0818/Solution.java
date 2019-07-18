package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Копчиков", 600);
        map.put("Поносиков", 400);
        map.put("Днищин", 550);
        map.put("Поросяткин", 450);
        map.put("Шлепанец", 475);
        map.put("Горилла", 501);
        map.put("ЛяпкаДжо", 520);
        map.put("Неувязок", 100);
        map.put("Хлопушкин", 300);
        map.put("Косорыльник", 710);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        ArrayList<String> poor = new ArrayList<>();
        for (HashMap.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 500) poor.add(pair.getKey());
        }
        for (String i: poor) map.remove(i);
    }

    public static void main(String[] args) {

    }
}