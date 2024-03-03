package Lab.day8.lab7_2update;

import java.security.SecureRandom;
import java.util.Random;

public class Dog extends Animal {
    private static final int MAX_SPEED = 60;
        Dog() {
            this.speed = new SecureRandom().nextInt(MAX_SPEED+1);
            this.name = "Dog";
        }


}
