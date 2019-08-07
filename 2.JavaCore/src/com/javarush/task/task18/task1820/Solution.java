package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileOutputStream fos = new FileOutputStream(reader.readLine());
        reader.close();
        ArrayList<Double> inputList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (fis.available() > 0) {
            char ch = (char) fis.read();
            sb.append(ch);
        }
        String[] input = sb.toString().split(" ");

        for (String s: input) {
            if (!s.equals(" "))
            inputList.add(Double.parseDouble(s));
        }

        for (Double d: inputList) {
            sb2.append((int)Math.round(d)).append(" ");
        }
        String output = sb2.toString().substring(0, sb2.toString().lastIndexOf(" "));

        for (Character ch: output.toCharArray()) {
            fos.write(ch);
        }
        fis.close();
        fos.close();
    }
}
