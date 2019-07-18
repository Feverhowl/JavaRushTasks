package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Кузнецов", "Сергей");
        map.put("Ткаченко", "Андрей");
        map.put("Цыганова", "Виктория");
        map.put("Элланский", "Илья");
        map.put("Горлачев", "Артем");
        map.put("Золотарев", "Дмитрий");
        map.put("Абрамов", "Аркадий");
        map.put("Караев", "Джабраил");
        map.put("Шагиахметов", "Алексей");
        map.put("Киров", "Дмитрий");
    return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> blacklist = new ArrayList<>();
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            list.add(pair.getValue());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    blacklist.add(list.get(i));
                }
            }
        }
        for (String i: blacklist) removeItemFromMapByValue(map, i);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}