package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sYears = bufferedReader.readLine();
        int nYears = Integer.parseInt(sYears);
        String name = bufferedReader.readLine();

        System.out.println(name + " захватит мир через " + nYears + " лет. Му-ха-ха!");
    }
}
