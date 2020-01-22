package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        String text = outputStream.toString().replaceAll("\n", "");
        System.setOut(consoleStream);
        String[] data = text.split(" ");
        String solution = "";
        if (data[1].equals("+")) solution = "" + (Integer.parseInt(data[0]) + Integer.parseInt(data[2]));
        if (data[1].equals("-")) solution = "" + (Integer.parseInt(data[0]) - Integer.parseInt(data[2]));
        if (data[1].equals("*")) solution = "" + (Integer.parseInt(data[0]) * Integer.parseInt(data[2]));
        System.out.print(text + solution);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

