package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String[] x = new String[3];
        x[0] = "Мама";
        x[1] = "Мыла";
        x[2] = "Раму";
        int arrayLength = 3;
        for (int i = 0; i < arrayLength; i++){
            for(int j = 0; j < arrayLength; j++){
                for (int k = 0; k < arrayLength; k++){
                    if (i == j)
                        continue;
                    if (j == k)
                        continue;
                    if (k == i)
                        continue;

                    System.out.print(x[i]);
                    System.out.print(x[j]);
                    System.out.println(x[k]);
                }
            }
        }
    }
}