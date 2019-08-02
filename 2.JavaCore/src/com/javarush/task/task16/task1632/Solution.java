package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
    }

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
                if (0 == 1) break;
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try { Thread.sleep(500); } catch (InterruptedException e) { /* O_o */ }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        private boolean isFalse;

        @Override
        public void run() {
            while (!isFalse) { }
        }

        @Override
        public void showWarning() {
            isFalse = true;
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            int output = 0;
            try {
                while(true) {
                    input = reader.readLine();
                    if (input.equals("N")) break;
                    output += Integer.parseInt(input);
                }
                System.out.println(output);
            } catch (IOException e) { e.printStackTrace(); }
        }
    }
}