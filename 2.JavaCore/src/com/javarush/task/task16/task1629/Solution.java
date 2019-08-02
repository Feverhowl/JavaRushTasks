package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        private String input_1;
        private String input_2;
        private String input_3;

        @Override
        public void run() {
            try {
                input_1 = reader.readLine();
                input_2 = reader.readLine();
                input_3 = reader.readLine();
            } catch (IOException e) { e.printStackTrace(); }
        }

        public void printResult() {
            System.out.println(input_1 + " " + input_2 + " " + input_3);
        }
    }
}
