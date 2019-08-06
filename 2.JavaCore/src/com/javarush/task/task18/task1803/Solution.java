package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        int[] array = new int[255];
        while (fis.available() > 0) {
            int data = fis.read();
            array[data]++;
        }
        fis.close();
        reader.close();
        int maxRepeat = 0;

        for (Integer in: array) {
            if (in > maxRepeat) maxRepeat= in;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxRepeat) System.out.print(i + " ");
        }
    }
}
