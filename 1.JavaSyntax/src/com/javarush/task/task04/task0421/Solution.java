package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        String y = reader.readLine();
        int a = x.length();
        int b = y.length();
        if (x.equals(y))
            System.out.println("Имена идентичны");
        else if (a == b)
            System.out.println("Длины имен равны");
        else;
    }
}
