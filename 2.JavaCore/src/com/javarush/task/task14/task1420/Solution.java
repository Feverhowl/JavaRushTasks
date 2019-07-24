package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Вводим 2 числа с клавиатуры
        int first = Integer.parseInt(reader.readLine());
        if (first <= 0) throw new Exception();
        int second = Integer.parseInt(reader.readLine());
        if (second <= 0) throw new Exception();

        // Выводим на экран наибольший общий делитель чисел first и second
        System.out.println(nod(first, second));
    }
    // Метод "Рекурсия и остатки" - алгоритм вычисления НОД
    private static int nod(int a, int b) {
        if (b == 0) return a;
        return nod(b, a % b);
    }
}
