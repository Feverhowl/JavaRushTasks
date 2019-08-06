package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileOutputStream fos = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[fis.available()];

        while (fis.available() > 0) {
            int count = fis.read(buffer);
            fos.write(reverse(buffer, buffer.length), 0, count);
        }

        fis.close();
        fos.close();
    }

    private static byte[] reverse(byte[] a, int n) {
        byte[] b = new byte[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;
    }
}
