package ru.geekbrains;

import java.util.Random;

    public class Animal {

        String name;
        String type;
        int maxRun;
        int maxSwim;
        double maxJump;
        public Random random = new Random();


        public Animal(String name) {
            this.name = name;
        }

        public void animalInfo() {
            System.out.println("Животное " + this.type + " " + this.name);
        }
        public void run(int distance) {
            if (this.maxRun >= distance) {

                System.out.println(this.type + " " + this.name + " бежит " + distance + " м.");
            } else {
                System.out.println(this.type + " " + this.name + " не может столько бежать");
            }
        }

        public void swim(int distance) {
            if (this.maxSwim >= distance) {

                System.out.println(this.type + " " + this.name + " плывет " + distance + " м.");
            } else {
                System.out.println(this.type + " " + this.name + " не может так далеко плыть");
            }
        }

        public void jump_over(int distance) {
            if (this.maxJump >= distance) {
                System.out.println(this.type + " " + this.name + " перепрыгивает препятствие в " + distance + " м.");
            } else {
                System.out.println(this.type + " " + this.name + " не может так высоко прыгать.");
            }
        }
    }
