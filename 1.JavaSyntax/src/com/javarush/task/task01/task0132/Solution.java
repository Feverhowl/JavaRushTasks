package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String str = String.valueOf(number);
        String[] num = str.split("");
        int x = Integer.parseInt(num[0]);
        int y = Integer.parseInt(num[1]);
        int z = Integer.parseInt(num[2]);
        return x + y + z;
    }
}