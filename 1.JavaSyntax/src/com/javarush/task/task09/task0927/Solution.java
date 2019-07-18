package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        Cat cat1 = new Cat("Васька");
        map.put(cat1.name, cat1);
        Cat cat2 = new Cat("Барсик");
        map.put(cat2.name, cat2);
        Cat cat3 = new Cat("Жоржик");
        map.put(cat3.name, cat3);
        Cat cat4 = new Cat("Феликс");
        map.put(cat4.name, cat4);
        Cat cat5 = new Cat("Джабраил");
        map.put(cat5.name, cat5);
        Cat cat6 = new Cat("Марыся");
        map.put(cat6.name, cat6);
        Cat cat7 = new Cat("Котэжко");
        map.put(cat7.name, cat7);
        Cat cat8 = new Cat("Кричалка");
        map.put(cat8.name, cat8);
        Cat cat9 = new Cat("Ушлепок");
        map.put(cat9.name, cat9);
        Cat cat10 = new Cat("Подранок");
        map.put(cat10.name, cat10);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair: map.entrySet()) {
            Cat value = pair.getValue();
            set.add(value);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}