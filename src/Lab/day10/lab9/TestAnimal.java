package Lab.day10.lab9;


import java.security.SecureRandom;
import java.util.ArrayList;

import java.util.List;


public class TestAnimal {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new ListClassAnimal.Tiger.Builder().setName("Tiger").setMaxSpeed(100).setFlyable(false).build());
        animals.add(new ListClassAnimal.Falcon.Builder().setName("Falcon").setMaxSpeed(200).setFlyable(true).build());  // Falcon
        animals.add(new ListClassAnimal.Snake.Builder().setName("Snake").setMaxSpeed(120).setFlyable(false).build()); // Snake
        animals.add(new ListClassAnimal.Eagle.Builder().setName("Eagle").setMaxSpeed(220).setFlyable(true).build());  // Eagle

        System.out.println(animals);

        Animal winner = null;
        int maxSpeedFlyable = Integer.MIN_VALUE;
        for (Animal animal : animals) {
            if (animal.isFlyable()) {
                maxSpeedFlyable = Math.max(maxSpeedFlyable, animal.getMaxSpeed());
                winner = animal;
            }
        }

        System.out.println("Max speed of flyable animals: " + maxSpeedFlyable);


    }
}
