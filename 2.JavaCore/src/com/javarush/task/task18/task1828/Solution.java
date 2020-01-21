package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        // Если передано меньше 2 параметров или первый параметр не "-u" или первый параметр не "-d"
        if (args.length < 2) return;

        // Считываем название файла
        String fileName = "prices2";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException e) { /* Nothing to do O_o */ }

        // Тащим списов товаров из файла
        List<String> lines = new ArrayList<>();
        try (BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            while (fr.ready()) lines.add(fr.readLine());
        } catch (IOException e) { /* Nothing to do O_o */ }

        // Вычисляем айдишник и позицию по айдишнику для товара, инфу о котором собираемся менять
        int position = -1;
        int id = Integer.parseInt(args[1]);
        for (int i = 0; i < lines.size(); i++) {
            if (id == Integer.parseInt(lines.get(i).substring(0, 8).trim())) {
                position = i;
                break;
            }
        }
        if (position == -1) return;

        // Операция удаления
        if (args[0].equals("-d")) {
            lines.remove(position);
            // Записываем в файл "почищенный" список товаров
            try (BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))){
                for (String s: lines) bufWriter.write(s + "\r\n");
            } catch (IOException e) { /* Nothing to do O_o */ }
        }

        // Операция обновления инфы о товаре
        if (args[0].equals("-u")) {
            // Определяем новое название для товара
            String productName;
            if (args.length > 5) {
                StringBuilder builder = new StringBuilder();
                for (int i = 2; i < args.length - 2; i++) {
                    builder.append(args[i]).append(" ");
                }
                builder.append("                              ");
                productName = builder.toString().substring(0, 30);
            } else productName = args[2];

            // Определяем новую цену для товара
            float price = Float.parseFloat(args[args.length - 2]);

            // Определяем новое количество для товара
            int quantity = Integer.parseInt(args[args.length - 1]);

            // Записываем в файл строку с обовленной инфой о товаре:
            lines.set(position, (String.format(Locale.ROOT, "%-8d%-30s%-8.2f%-4d", id, productName, price, quantity)));
            try (BufferedWriter bufWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
                for (String s: lines) bufWriter.write(s + "\r\n");
            } catch (IOException e) { /* Nothing to do O_o */ }
        }
    }
}
