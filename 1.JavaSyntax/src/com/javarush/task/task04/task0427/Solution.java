package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (x > 0 && x < 1000)
            if (x < 10)
                if ((x % 2) != 0)
                    System.out.println("нечетное однозначное число");
                else
                    System.out.println("четное однозначное число");
            else if (x < 100)
                if ((x % 2) != 0)
                    System.out.println("нечетное двузначное число");
                else
                    System.out.println("четное двузначное число");
            else
                if ((x % 2) != 0)
                    System.out.println("нечетное трехзначное число");
                else
                    System.out.println("четное трехзначное число");
        else;
    }
}
