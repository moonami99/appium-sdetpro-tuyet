package Lab.day8.lab7_2;

import java.util.Random;

public class Tiger extends Animal {
        Tiger() {
            super("Tiger", 100);
        }

        @Override
        int getSpeed() {
            return new Random().nextInt(maxSpeed) + 1;
        }
}
