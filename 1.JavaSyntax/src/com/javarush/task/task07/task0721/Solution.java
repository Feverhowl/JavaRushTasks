package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int numbers[] = new int[20];
        for (int i = 0; i < numbers.length; i++) numbers[i] = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numbers.length; i++) {
            maximum = numbers[i] > maximum ? numbers[i] : maximum;
            minimum = numbers[i] < minimum ? numbers[i] : minimum;
        }
        System.out.print(maximum + " " + minimum);
    }
}