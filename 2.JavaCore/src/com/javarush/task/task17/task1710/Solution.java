package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        if (args[0].equals("-i")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String sex;
            if (person.getSex() == Sex.MALE) sex = "м";
            else sex = "ж";
            System.out.println(person.getName() + " " + sex + " " + sdf.format(person.getBirthDate()));
        }

        if (args[0].equals("-d")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }

        if (args[0].equals("-u")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            if (args[3].equals("м")) person.setSex(Sex.MALE);
            else person.setSex(Sex.FEMALE);
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            try { person.setBirthDate(format.parse(args[4])); } catch (ParseException e) { e.printStackTrace(); }
        }

        if (args[0].equals("-c")) {
            Person person;
            Date date = null;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            try { date = format.parse(args[3]); } catch (ParseException e) { e.printStackTrace(); }
            if (args[2].equals("м")) person = Person.createMale(args[1], date);
            else person = Person.createFemale(args[1], date);
            allPeople.add(person);
            System.out.println(allPeople.size() - 1);
        }
    }
}
