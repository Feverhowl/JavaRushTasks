package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        String[] strings = s.split("\\s+");
        StringBuilder sb = new StringBuilder(s);
        sb.delete(0, s.length());
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1, strings[i].length()));
            if (i < strings.length - 1)
                sb.append(" ");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}