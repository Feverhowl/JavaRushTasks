package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        boolean a = (this.age > anotherCat.age);
        boolean b = (this.weight > anotherCat.weight);
        boolean c = (this.strength > anotherCat.strength);
        return ((a && b) || (a && c) || (b && c) || (a && b && c));
    }

    public static void main(String[] args) {

    }
}