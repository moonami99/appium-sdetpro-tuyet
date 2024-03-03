package Lab.day10.lab9;

import java.security.SecureRandom;

public class ListClassAnimal {
    public static class Dog extends Animal {
        private static final int MAX_SPEED = 60;
        public Dog() {
            this.maxSpeed = new SecureRandom().nextInt(MAX_SPEED+1);
            this.name = "Dog";
            this.flyable = false;
        }
    }

    public static class Eagle extends Animal {
        private static final int MAX_SPEED = 150;
        public Eagle() {
            this.maxSpeed = new SecureRandom().nextInt(MAX_SPEED+1);
            this.name = "Eagle";
            this.flyable = true;
        }
    }

    public static class Falcon extends Animal {
        private static final int MAX_SPEED = 120;
        public Falcon() {
            this.maxSpeed = new SecureRandom().nextInt(MAX_SPEED+1);
            this.name = "Falcon";
            this.flyable = true;
        }
    }

    public static class Horse extends Animal {
        private static final int MAX_SPEED = 75;
        public Horse() {
            this.maxSpeed = new SecureRandom().nextInt(MAX_SPEED+1);
            this.name = "Horse";
            this.flyable = false;
        }
    }

    public static class Snake extends Animal {
        private static final int MAX_SPEED = 5;
        public Snake() {
            this.maxSpeed = new SecureRandom().nextInt(MAX_SPEED+1);
            this.name = "Snake";
            this.flyable = false;
        }
    }

    public static class Tiger extends Animal {
        private static final int MAX_SPEED = 100;
        public Tiger() {
            this.maxSpeed = new SecureRandom().nextInt(MAX_SPEED+1);
            this.name = "Tiger";
            this.flyable = false;
        }
    }
}
