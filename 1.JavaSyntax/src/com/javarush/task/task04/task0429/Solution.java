package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        int neg = 0;
        int pos = 0;
        if (x > 0)
            pos++;
        else if (x < 0)
            neg++;
        if (y > 0)
            pos++;
        else if (y < 0)
            neg++;
        if (z > 0)
            pos++;
        else if (z < 0)
            neg++;
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);
    }
}