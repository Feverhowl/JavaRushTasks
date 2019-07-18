package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;
        while (true) {
            String smoney = reader.readLine();
            if (smoney.equals("сумма")) {
                break;
            }
            int money = Integer.parseInt(smoney);
            summ += money;
        }
        System.out.println(summ);
    }
}