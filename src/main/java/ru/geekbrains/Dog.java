package ru.geekbrains;

    public class Dog extends Animal {

        public Dog(String name) {
            super(name);
            this.type = "Собака";
            this.maxJump = random.nextDouble();
            if (this.maxJump > 0.5) maxJump = 0.5;
            this.maxRun = random.nextInt(100)+400;
            this.maxSwim = random.nextInt(5)+5;
        }
    }
