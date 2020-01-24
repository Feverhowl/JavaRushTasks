package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1name = reader.readLine();
        String file2name = reader.readLine();
        reader.close();

        BufferedReader fr1 = new BufferedReader(new FileReader(file1name));
        BufferedReader fr2 = new BufferedReader(new FileReader(file2name));

        List<String> data1 = new ArrayList<>();
        while (fr1.ready()) {
            data1.add(fr1.readLine());
        }
        fr1.close();

        List<String> data2 = new ArrayList<>();
        while (fr2.ready()) {
            data2.add(fr2.readLine());
        }
        fr2.close();

        int count2 = 0;

        for (int i = 0; i < data1.size() ; i++) {
            if (count2 >= data2.size() - 1) {
                lines.add(new LineItem(Type.REMOVED, data1.get(i)));
            }

            if (data1.get(i).equals(data2.get(count2))) {
                lines.add(new LineItem(Type.SAME, data1.get(i)));
                count2++;
            }

            try {
                if (!data1.get(i).equals(data2.get(count2))) {
                    if (!data1.get(i).equals(data2.get(count2 - 1)) && !data1.get(i).equals(data2.get(count2 + 1))) {
                        lines.add(new LineItem(Type.REMOVED, data1.get(i)));
                    }
                    if (data1.get(i).equals(data2.get(count2 + 1))) {
                        lines.add(new LineItem(Type.ADDED, data2.get(count2)));
                        i--;
                        count2++;
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                if ((i == data1.size() - 1) && (count2 < data2.size())) {
                    for (int j = 0; j < data2.size() - count2; j++) {
                        lines.add(new LineItem(Type.ADDED, data2.get(count2)));
                        count2++;
                    }
                }
            }
            if ((i == data1.size() - 1) && (count2 < data2.size())) {
                for (int j = 0; j < data2.size() - count2; j++) {
                    lines.add(new LineItem(Type.ADDED, data2.get(count2)));
                    count2++;
                }
            }
        }
        // CHECK
        for (LineItem item: lines) System.out.println(item.type + " " + item.line);
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
