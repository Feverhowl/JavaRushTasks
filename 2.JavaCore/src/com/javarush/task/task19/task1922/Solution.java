package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        // Считываем с консоли имя файла
        String fileName = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        } catch (IOException e) { /* Nothing to do */ }

        // Тащим строки из файла, раскладываем на массив строк, считаем кол-во заданных слов в строке
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.ready()) {
                String line = br.readLine();
                String[] data = line.split(" ");
                int counter = 0;
                for (String s: data)
                    for (String w: words)
                        if (s.equals(w)) counter++;
                // Выводим строки, удовлетворяющие условию (содержат только два слова из списка words)
                if (counter == 2) System.out.println(line);
            }
        } catch (IOException e) { /* Nothing to do */ }
    }
}
