package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) strings.add(reader.readLine());
        int max = strings.get(0).length();
        for (int i = 1; i < strings.size() ; i++) {
            if (strings.get(i).length() > max)
                max = strings.get(i).length();
        }
        ArrayList<String> maxStrings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == max)
                maxStrings.add(strings.get(i));
        }
        maxStrings.forEach(System.out::println);
    }
}