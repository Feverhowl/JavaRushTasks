package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int passengers = 0;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (input.equals("helicopter")) result = new Helicopter();
        if (input.equals("plane")) {
            try {
                passengers = Integer.parseInt(reader.readLine());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            result = new Plane(passengers);
        }
        try {
            reader.close();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
