package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            if (s.startsWith(args[0] + " ")) System.out.print(s);
        }
        fileReader.close();

        /* Моё решение, которое не принял валидатор (хотя работает правильно)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        while (fis.available() > 0) {
            char ch = (char) fis.read();
            if (ch == '\n') {
                list.add(sb.toString());
                sb.setLength(0);
            }
            else sb.append(ch);
        }

        for (String s: list) {
            if (s.substring(0, s.indexOf(" ")).equals(args[0])) System.out.println(s);
        }
        fis.close();
        */
    }
}
