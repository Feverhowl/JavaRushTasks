package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list1.add("Вася " + i);
            list1.add("Петя " + i);
            list1.add("Коля " + i);
            list2.add("Маша " + i);
            list2.add("Вера " + i);
            list2.add("Люба " + i);
        }
        ArrayList<String>[] arrayOfStringList = (ArrayList<String>[])new ArrayList[2];
        arrayOfStringList[0] = list1;
        arrayOfStringList[1] = list2;

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
