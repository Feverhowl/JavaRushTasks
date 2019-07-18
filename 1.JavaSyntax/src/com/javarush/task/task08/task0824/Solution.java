package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list4 = new ArrayList<>();

        Human children3 = new Human();
        children3.name = "Мила";
        children3.sex = false;
        children3.age = 22;
        children3.children = list4;
        String c3 = children3.toString();

        Human children2 = new Human();
        children2.name = "Артемий";
        children2.sex = true;
        children2.age = 29;
        children2.children = list4;
        String c2 = children2.toString();

        Human children1 = new Human();
        children1.name = "Алексий";
        children1.sex = true;
        children1.age = 25;
        children1.children = list4;
        String c1 = children1.toString();

        ArrayList<Human> list3 = new ArrayList<>();
        list3.add(children1);
        list3.add(children2);
        list3.add(children3);

        Human father = new Human();
        father.name = "Евстафий";
        father.sex = true;
        father.age = 53;
        father.children = list3;
        String f = father.toString();

        Human mother = new Human();
        mother.name = "Марианна";
        mother.sex = false;
        mother.age = 50;
        mother.children = list3;
        String m = mother.toString();

        ArrayList<Human> list2 = new ArrayList<>();
        list2.add(father);

        Human grandfather1 = new Human();
        grandfather1.name = "Николай";
        grandfather1.sex = true;
        grandfather1.age = 82;
        grandfather1.children = list2;
        String gf1 = grandfather1.toString();

        Human grandmother1 = new Human();
        grandmother1.name = "Клавдия";
        grandmother1.sex = false;
        grandmother1.age = 81;
        grandmother1.children = list2;
        String gm1 = grandmother1.toString();

        ArrayList<Human> list1 = new ArrayList<>();
        list1.add(mother);

        Human grandfather2 = new Human();
        grandfather2.name = "Виктор";
        grandfather2.sex = true;
        grandfather2.age = 80;
        grandfather2.children = list1;
        String gf2 = grandfather2.toString();

        Human grandmother2 = new Human();
        grandmother2.name = "Клавдия";
        grandmother2.sex = false;
        grandmother2.age = 78;
        grandmother2.children = list1;
        String gm2 = grandmother2.toString();

        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}