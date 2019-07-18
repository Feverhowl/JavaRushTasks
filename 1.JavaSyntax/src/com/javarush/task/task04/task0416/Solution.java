package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double y = Double.parseDouble(reader.readLine());
        double x = y % 5;
        if (x >= 0.0 && x < 3.0)
            System.out.println("зеленый");
        else if (x >= 3.0 && x < 4.0)
            System.out.println("желтый");
        else
            System.out.println("красный");
    }
}