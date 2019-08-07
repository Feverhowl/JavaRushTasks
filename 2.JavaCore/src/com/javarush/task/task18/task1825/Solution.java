package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String nextFileName;
        String fileName = "";
        while (true) {
            nextFileName = reader.readLine();
            if (nextFileName.equals("end")) break;
            else {
                list.add(nextFileName);
                fileName = nextFileName.substring(0, nextFileName.indexOf(".part"));
            }
        }
        File file = new File(fileName);
        file.createNewFile();
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName));

        Collections.sort(list);
        for (String s: list) {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(s));
            while (inputStream.available() > 0) {
                outputStream.write(inputStream.read());
            }
            inputStream.close();
        }
        outputStream.close();
        reader.close();
    }
}
