package Lab.day8.lab7_2;

import java.util.List;

public class AnimalController {
    public static Animal RacingAnimal(List<Animal> animals){
        Animal winner = null;
        int maxSpeed = 0;

        for (Animal animal : animals) {
            int speed = animal.getSpeed();
            if (speed > maxSpeed) {
                maxSpeed = speed;
                winner = animal;
            }
        }
        return winner;
    }
}
