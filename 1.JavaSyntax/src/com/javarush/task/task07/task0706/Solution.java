package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] homes = new int[15];
        int che = 0;
        int neche = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) homes[i] = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 15; i = i + 2) che += homes[i];
        for (int i = 1; i < 15; i = i + 2) neche += homes[i];
        if (che > neche)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}