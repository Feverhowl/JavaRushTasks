package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "мама", "мыла", "раму");
        for (int i = 1; i <= 5; i = i + 2) list.add(i, "именно");
        list.forEach(System.out::println);
    }
}