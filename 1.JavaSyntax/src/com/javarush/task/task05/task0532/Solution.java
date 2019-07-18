package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = -2147483648;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());

            if (number > maximum)
                maximum = number;
            else;
        }
        System.out.println(maximum);
    }
}