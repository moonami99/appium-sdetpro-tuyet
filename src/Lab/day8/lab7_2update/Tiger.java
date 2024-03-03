package Lab.day8.lab7_2update;

import java.security.SecureRandom;
import java.util.Random;

public class Tiger extends Animal {
    private static final int MAX_SPEED = 100;
        Tiger() {
            this.speed = new SecureRandom().nextInt(MAX_SPEED+1);
            this.name = "Tiger";
        }
}
