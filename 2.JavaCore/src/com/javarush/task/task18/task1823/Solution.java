package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;

        while (true) {
            filename = reader.readLine();
            if (filename.equals("exit")) break;

            ReadThread thread = new ReadThread(filename);
            thread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private int findedByte;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут


        @Override
        public void run() {
            try {
                FileInputStream fis = new FileInputStream(fileName);
                int[] data = new int[256];
                while (fis.available() > 0) {
                    data[fis.read()]++;
                }
                int max = 0;
                for (int i = 0; i < data.length; i++) {
                    if (data[i] > max) {
                        max = data[i];
                        findedByte = i;
                    }
                }
                fis.close();

                synchronized (resultMap) {
                    resultMap.put(fileName, findedByte);
                }

            } catch (Exception e) { /* O_O */ }
        }
    }
}
