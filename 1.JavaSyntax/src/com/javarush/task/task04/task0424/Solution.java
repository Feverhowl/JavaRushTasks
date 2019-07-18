package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        if (x != y)
            if (x != z)
                if (y != z)
                    System.out.print("");
                else
                    System.out.println(1);
            else
                System.out.println(2);
        else
            System.out.println(3);
    }
}
