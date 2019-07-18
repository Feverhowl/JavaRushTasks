package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String weekS = reader.readLine();
        int week = Integer.parseInt(weekS);
        if (week == 1)
            System.out.println("понедельник");
        else if (week == 2)
            System.out.println("вторник");
        else if (week == 3)
            System.out.println("среда");
        else if (week == 4)
            System.out.println("четверг");
        else if (week == 5)
            System.out.println("пятница");
        else if (week == 6)
            System.out.println("суббота");
        else if (week == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");
    }
}