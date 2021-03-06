package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog gavDog = new Dog("Gav", 4, 25);
        Cat tomCat = new Cat("Tom", 50, "Blue");
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int age;
        int tail;

        public Dog(String name, int age, int tail) {
            this.name = name;
            this.age = age;
            this.tail = tail;
        }
    }
    public static class Cat {
        String name;
        int lenght;
        String color;

        public Cat(String name, int lenght, String color) {
            this.name = name;
            this.lenght = lenght;
            this.color = color;
        }
    }
}