package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(Integer.parseInt(reader.readLine()));
        int max = 1;
        int len = 1;
        int ch = list.get(0);
        for (int i = 1; i < 10; i++) {
            if (list.get(i) == ch)
                len++;
            if (list.get(i) != ch) {
                if (len > max)
                    max = len;
                len = 1;
                ch = list.get(i);
            }
        }
        if (len > max)
            max = len;
        System.out.println(max);
    }
}