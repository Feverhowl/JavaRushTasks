package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (value.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        if (map.containsKey(lastName)) count += 1;
        return count;
    }

    public static void main(String[] args) {
        //HashMap<String, String> dno = createMap();
        //System.out.println(getCountTheSameLastName(dno, "Караев"));
        //System.out.println(getCountTheSameFirstName(dno, "Дмитрий"));
    }
}