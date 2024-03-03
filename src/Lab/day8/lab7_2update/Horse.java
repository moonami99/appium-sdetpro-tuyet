package Lab.day8.lab7_2update;

import java.security.SecureRandom;
import java.util.Random;

public class Horse extends Animal {
    private static final int MAX_SPEED = 75;
    Horse() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED+1);
        this.name = "Horse";
    }

}
