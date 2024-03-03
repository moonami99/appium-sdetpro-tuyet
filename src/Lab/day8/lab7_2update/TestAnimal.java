package Lab.day8.lab7_2update;

import java.util.ArrayList;
import java.util.List;

import static Lab.day8.lab7_2update.AnimalController.RacingAnimal;

public class TestAnimal {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Horse());
        animals.add(new Tiger());
        animals.add(new Dog());

        //mỗi lần gọi lại thì speed của con vật sẽ KHÔNG BỊ THAY ĐỔI

        System.out.println(animals);
        System.out.println(RacingAnimal(animals));



    }
}
