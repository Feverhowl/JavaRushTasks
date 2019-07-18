package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = "8";
        int x = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == i)
                    System.out.println(s);
                else
                    System.out.print(s);
            }
        }
    }
}