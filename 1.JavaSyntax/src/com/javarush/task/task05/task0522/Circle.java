package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle (double x) {
        this.x = x;
        this.y = 10;
        this.radius = 5;
    }

    public Circle (double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 5;
    }

    public Circle (Circle cir) {
        this.x = cir.x;
        this.y = cir.y;
        this.radius = cir.radius;
    }

    public Circle () {
        this (5,5,1);
    }

    public static void main(String[] args) {

    }
}