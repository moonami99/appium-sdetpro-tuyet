package Lab.day10.lab9update;

import java.security.SecureRandom;
import java.util.Arrays;

import static Lab.day10.lab9update.Animal.Builder;

public class Test {
    public static void main(String[] args) {
        Animal horse = new Builder().setName("Horse").setSpeed(generateAnimalSpeed(70)).setFlyable(false).build();
        Animal tiger = new Builder().setName("Tiger").setSpeed(generateAnimalSpeed(100)).setFlyable(false).build();
        Animal eagle = new Builder().setName("Eagle").setSpeed(generateAnimalSpeed(60)).setFlyable(false).build();


        Animal winner = new RacingController().getWinner(Arrays.asList(horse,tiger,eagle));
        System.out.println(winner);

    }
    private static int generateAnimalSpeed (int maxSpeed){
        return new SecureRandom().nextInt(maxSpeed)+1;
    }
}
