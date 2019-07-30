package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2.5, "Cock");
        labels.put(2.7, "Dick");
        labels.put(2.9, "Dildo");
        labels.put(3.1, "Prick");
        labels.put(3.3, "Penis");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
