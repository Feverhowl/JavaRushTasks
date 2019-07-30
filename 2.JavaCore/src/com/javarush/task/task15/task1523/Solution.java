package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    private String string;
    private Integer integer;

    public Solution() { }
    protected Solution(String string) { }
    Solution(Integer integer) { }
    private Solution(String string, Integer integer) { }
}

