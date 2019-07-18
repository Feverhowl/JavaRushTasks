package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        int a, b, c;
        if (x >= y && x >= z)
            a = x;
        else if (y >= x && y >= z)
            a = y;
        else
            a = z;
        if (x >= y && x <= z)
            b = x;
        else if (x <= y && x >= z)
            b = x;
        else if (y >= x && y <= z)
            b = y;
        else if (y >= z && y <= x)
            b = y;
        else
            b = z;
        if (x <= y && x <= z)
            c = x;
        else if (y <= x && y <= z)
            c = y;
        else
            c = z;
        System.out.println(a + " " + b + " " + c);
    }
}