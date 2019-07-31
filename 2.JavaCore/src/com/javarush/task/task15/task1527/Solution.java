package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try { input = reader.readLine(); } catch (IOException e) { e.printStackTrace(); }
        StringBuilder builder = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        String s;
        for (String retval: input.substring(input.indexOf("?") + 1).split("&")) {
            if (retval.contains("=")) {
                s = retval.substring(0, retval.indexOf("="));
                builder.append(s).append(" ");
                map.put(s, retval.substring(retval.indexOf("=") + 1));
            }
            else {
                builder.append(retval).append(" ");
                map.put(retval, "");
            }
        }

        String output = builder.toString().substring(0, builder.toString().lastIndexOf(" "));
        System.out.println(output);

        if (output.contains("obj")) {
            try {
                alert(Double.parseDouble(map.get("obj")));
            } catch (NumberFormatException e) {
                alert(map.get("obj"));
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
