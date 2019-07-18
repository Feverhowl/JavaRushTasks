package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private String momsName;
        private String programmingSkills;
        private double gpa;
        private boolean isMale;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human (String name, int age, String momsName, boolean isMale) {
            this.name = name;
            this.age = age;
            this.momsName = momsName;
            this.isMale = isMale;
        }

        public Human (String name, int age, String programmingSkills, double gpa) {
            this.name = name;
            this.age = age;
            this.programmingSkills = programmingSkills;
            this.gpa = gpa;
        }

        public Human (String programmingSkills, boolean isMale) {
            this.programmingSkills = programmingSkills;
            this.isMale = isMale;
        }

        public Human (int age, double gpa) {
            this.age = age;
            this.gpa = gpa;
        }

        public Human (double gpa, boolean isMale) {
            this.gpa = gpa;
            this.isMale = isMale;
        }

        public Human (String name, String programmingSkills, String momsName) {
            this.name = name;
            this.programmingSkills = programmingSkills;
            this.momsName = momsName;
        }

        public Human (String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public Human (String name, int age, String momsName, String programmingSkills, double gpa, boolean isMale) {
            this.name = name;
            this.age = age;
            this.momsName = momsName;
            this.programmingSkills = programmingSkills;
            this.gpa = gpa;
            this.isMale = isMale;
        }
    }
}
