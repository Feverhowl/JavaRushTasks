package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while (br.ready()) {
                String[] data = br.readLine().split(" ");

                // Парсим дату рождения
                DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date birthday = null;
                try {
                    birthday = dateFormat.parse(data[data.length - 3] + " " + data[data.length - 2] + " " +
                            data[data.length - 1]);
                } catch (ParseException e) { /* Nothing to do */ }

                // Парсим и составляем имя
                StringBuilder sb = new StringBuilder();
                sb.append(data[0]);
                if (data.length > 4) {
                    for (int i = 1; i < data.length - 3; i++) sb.append(" ").append(data[i]);
                }

                // Добавляем объект Person в список
                PEOPLE.add(new Person(sb.toString(), birthday));
            }
        } catch (IOException e) { /* Nothing to do */ }
    }
}
