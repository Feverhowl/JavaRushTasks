package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case ("-i") :
                synchronized (Solution.class) {
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String sex;
                        if (person.getSex() == Sex.MALE) sex = "м";
                        else sex = "ж";
                        System.out.println(person.getName() + " " + sex + " " + sdf.format(person.getBirthDate()));
                    }
                }
                break;

            case ("-d") :
                synchronized (Solution.class) {
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
                break;

            case ("-u") :
                synchronized (Solution.class) {
                    for (int i = 1; i < args.length; i += 4) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(args[i + 1]);
                        if (args[i + 2].equals("м")) person.setSex(Sex.MALE);
                        else person.setSex(Sex.FEMALE);
                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                        try { person.setBirthDate(format.parse(args[i + 3])); } catch (ParseException e) {
                            e.printStackTrace(); }
                    }
                }
                break;

            case ("-c") :
                synchronized (Solution.class) {
                    for (int i = 1; i < args.length; i += 3) {
                        Person person;
                        Date date = null;
                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                        try { date = format.parse(args[i + 2]); } catch (ParseException e) { e.printStackTrace(); }
                        if (args[i + 1].equals("м")) person = Person.createMale(args[i], date);
                        else person = Person.createFemale(args[i], date);
                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;

            default :
                synchronized (Solution.class) { /* O_o */ }
                break;
        }
    }
}
