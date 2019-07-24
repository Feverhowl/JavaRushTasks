package com.javarush.task.task14.task1421;

public class Singleton {
    private static Singleton instance;

    // 2. Добавь в него статический метод getInstance()
    public static Singleton getInstance() {
        // 3. Метод getInstance должен возвращать один и тот же объект класса Singleton
        // при любом вызове метода getInstance
        return instance;
    }

    // 5. Сделай все конструкторы в классе Singleton приватными (private)
    private Singleton() {
    }
}
