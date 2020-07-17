package ru.geekbrains;

import java.util.Random;

public class Lesson_6 {
    public static void main(String[] args) {

        Cat cat = new Cat("Семен");
        Dog dog = new Dog("Грейс");

        cat.animalInfo();
        dog.animalInfo();

        cat.run(500);
        cat.run(100);
        cat.jump_over(1);
        cat.jump_over(5);
        cat.swim(5);

        dog.run(1000);
        dog.run(300);
        dog.jump_over(1);
        dog.jump_over(5);
        dog.swim(5);
        dog.swim(20);
    }
}
