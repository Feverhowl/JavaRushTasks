package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String yearS = reader.readLine();
        int year = Integer.parseInt(yearS);
        int x = year % 4;
        int y = year % 100;
        int z = year % 400;
        if (z == 0)
            System.out.println("количество дней в году: 366");
        else if (y == 0 && z > 0)
            System.out.println("количество дней в году: 365");
        else if (x == 0 && y > 0 && z > 0)
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}