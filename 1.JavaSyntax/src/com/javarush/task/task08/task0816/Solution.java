package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<>();
        map.put("Stallone", df.parse("JUNE 1 1981"));
        map.put("Condom", df.parse("JULY 2 1980"));
        map.put("Trash", df.parse("AUG 31 1982"));
        map.put("Shit", df.parse("SEP 1 1983"));
        map.put("Purple", df.parse("OCT 5 1984"));
        map.put("Asshole", df.parse("JAN 22 1985"));
        map.put("Pussy", df.parse("FEB 7 1986"));
        map.put("Cunt", df.parse("APR 8 1987"));
        map.put("Delivery", df.parse("MAY 31 1988"));
        map.put("Cum", df.parse("JUNE 9 1989"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        ArrayList<String> list = new ArrayList<>();
        for (HashMap.Entry<String, Date> pair : map.entrySet()) {
            Date value = pair.getValue();
            int a = value.getMonth();
            if (a > 4 && a < 8) {
                list.add(pair.getKey());
            }
        }
        for (String i: list) map.remove(i);
    }

    public static void main(String[] args) throws ParseException {

    }
}