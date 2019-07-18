package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int x = 1, y = 1;
        while (x < 11){
            while (y < 11){
                if (y == 10)
                    System.out.println(x*y);
                else
                    System.out.print(x*y + " ");
                y++;
            }
            y = 1;
            x++;
        }
    }
}