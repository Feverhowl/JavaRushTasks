package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try { Thread.sleep(100); } catch (Exception e) { }
        }

        System.out.println("Бум!");
    }
}