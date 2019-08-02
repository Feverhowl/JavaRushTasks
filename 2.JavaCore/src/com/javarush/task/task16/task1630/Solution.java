package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) { e.printStackTrace(); }
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private List<String> list = new ArrayList<>();
        private boolean isRun = false;

        @Override
        public void run() {
            isRun = true;
        }

        @Override
        public void setFileName(String fullFileName) {
            try {
                FileReader fr = new FileReader(fullFileName);
                Scanner scan = new Scanner(fr);
                while (scan.hasNextLine()) {
                    list.add(scan.nextLine());
                }
                scan.close();
                fr.close();
            } catch (Exception e) { e.printStackTrace(); }
        }

        @Override
        public String getFileContent() {
            if (isRun) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i));
                    if (i != list.size() - 1) sb.append(" ");
                }
                return sb.toString();
            }
            else return "";
        }
    }
}
