package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        if (x >= (y + z) || y >= (x + z) || z >= (x + y))
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");
    }
}