package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> list = new HashMap<>();
        list.put("Задерищенский", "Уася");
        list.put("Задерищенский", "Петя");
        list.put("Холодрищенский", "Джамал");
        list.put("Холодрищенский", "Артем");
        list.put("Сапербезногий", "Уася");
        list.put("Клишков", "Петя");
        list.put("Сапогов", "Аркадий");
        list.put("Крикун", "Евгений");
        list.put("Хохотушкин", "Станислав");
        list.put("Яблочкин", "Чеботок");
        return list;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
