package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Если передано меньше 4 параметров или первый параметр не "-с"
        if (args.length < 4 || !args[0].equals("-c")) return;

        // Считываем название файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        // Вычисляем айдишник для товара, который собираемся добавлять
        List<String> lines = new ArrayList<>();
        try (BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            while (fr.ready()) lines.add(fr.readLine());
        }
        ArrayList<Integer> ids = new ArrayList<>();
        for (String s: lines) {
            ids.add(Integer.parseInt(s.substring(0,8).trim()));
        }
        int nextId = Collections.max(ids) + 1;

        // Определяем название добявляемого товара
        String productName;
        if (args.length > 4) {
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i < args.length - 2; i++) {
                builder.append(args[i]).append(" ");
            }
            builder.append("                              ");
            productName = builder.toString().substring(0, 30);
        } else productName = (args[1] + "                              ").substring(0, 30);

        // Определяем цену добавляемого товара
        float price = Float.parseFloat(args[args.length - 2]);

        // Определяем количество добавляемого товара
        int quantity = Integer.parseInt(args[args.length - 1]);

        // Записываем в файл строку с новым товаром:
        lines.add(String.format(Locale.ROOT, "%-8d%-30s%-8.2f%-4d", nextId, productName, price, quantity));
        try (BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
            for (String s: lines) bufWriter.write(s + "\r\n");
        }
    }
}
