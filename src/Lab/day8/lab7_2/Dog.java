package Lab.day8.lab7_2;

import java.util.Random;

public class Dog extends Animal {
        Dog() {
            super("Dog", 60);
        }

        @Override
        int getSpeed() {
            return new Random().nextInt(maxSpeed) + 1;
        }
}
