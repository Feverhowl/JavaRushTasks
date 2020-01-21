package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

        @Override
        public Person read() throws IOException {
            String[] person = fileScanner.nextLine().split(" ");
            DateFormat date = new SimpleDateFormat("dd MM yyyy");
            Date birthday = null;
            try {
                birthday = date.parse(person[3] + " " + person[4] + " " + person[5]);
            } catch (ParseException e) { /* O_o */ }
            return new Person(person[1], person[2], person[0], birthday);
        }
    }
}
