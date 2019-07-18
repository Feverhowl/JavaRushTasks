package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> del3 = new ArrayList<>();
        ArrayList<Integer> del2 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                del3.add(list.get(i));
                del2.add(list.get(i));
            }
            else if (list.get(i) % 3 != 0 && list.get(i) % 2 == 0)
                del2.add(list.get(i));
            else if (list.get(i) % 3 == 0 && list.get(i) % 2 != 0)
                del3.add(list.get(i));
            else
                other.add(list.get(i));
        }
        printList(del3);
        printList(del2);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        list.forEach(System.out::println);
    }
}