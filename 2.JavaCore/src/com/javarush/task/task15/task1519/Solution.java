package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = reader.readLine();
            if (input.equals("exit")) break;
            else {
                try {
                    if (input.contains(".")) print(Double.parseDouble(input));
                } catch (Exception e1) {
                    print(input);
                }
                try {
                    Integer in = Integer.parseInt(input);
                    if (in > 0 && in < 128) print(Short.parseShort(input));
                    else print(in);
                } catch (Exception e2) {
                    if (!input.contains(".")) print(input);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
