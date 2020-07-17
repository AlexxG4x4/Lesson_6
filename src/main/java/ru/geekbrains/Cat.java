package ru.geekbrains;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.type = "Кот";
        this.maxJump = random.nextDouble() + 1;;
        this.maxRun = random.nextInt(100)+100;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают!");
    }
}


