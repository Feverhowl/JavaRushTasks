package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String num1 = bufferedReader.readLine();
        int num1i = Integer.parseInt(num1);
        String num2 = bufferedReader.readLine();
        int num2i = Integer.parseInt(num2);

        System.out.println(name + " получает " + num1i + " через " + num2i + " лет.");
    }
}
