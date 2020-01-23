package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new StreamWithAds(new PrintStream(outputStream));
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleOut);
        System.out.println(outputStream.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }

    public static class StreamWithAds extends PrintStream {
        private static int counter = 0;
        private PrintStream printStream;

        StreamWithAds (PrintStream printStream) {
            super(printStream);
            this.printStream = printStream;
        }

        @Override
        public void print(String s) {
            if (StreamWithAds.counter == 1) {
                printStream.print(s + "\nJavaRush - курсы Java онлайн");
                StreamWithAds.counter = 0;
            } else {
                printStream.print(s);
                StreamWithAds.counter++;
            }
        }
    }
}
