package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            String fullFile1Name = reader.readLine();
            FileReader fr = new FileReader(fullFile1Name);
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                allLines.add(scan.nextLine());
            }
            scan.close();
            fr.close();
        } catch (Exception e) { e.printStackTrace(); }

        try {
            String fullFile2Name = reader.readLine();
            FileReader fr = new FileReader(fullFile2Name);
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                forRemoveLines.add(scan.nextLine());
            }
            scan.close();
            fr.close();
        } catch (Exception e) { e.printStackTrace(); }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) { e.printStackTrace(); }
    }

    public void joinData() throws CorruptedDataException {
        int count = 0;
        for (String s: forRemoveLines) {
            if (allLines.contains(s)) count++;
        }
        if (count == forRemoveLines.size()) {
            for (String st: forRemoveLines) {
                allLines.remove(st);
            }
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
