package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Уася", 18, "Наметкина, 12а");
        Man man2 = new Man("Жоржик", 25, "Ленинский проспект, 99");
        Woman woman1 = new Woman("Зинаида", 22, "Академика Пилюгина, 11");
        Woman woman2 = new Woman("Эллочка", 24, "Хорошевского Серебряного Бора, 2");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        public String name;
        public int age;
        public String address;

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        public String name;
        public int age;
        public String address;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}