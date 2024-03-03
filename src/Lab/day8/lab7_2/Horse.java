package Lab.day8.lab7_2;

import java.util.Random;

public class Horse extends Animal {
    Horse() {
        super("Horse", 75);
    }

    @Override
    int getSpeed() {
        return new Random().nextInt(maxSpeed) + 1;
    }
}
