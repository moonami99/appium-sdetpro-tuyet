package Lab.day10.lab9update;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public Animal getWinner(List<Animal> animalList){

        List<Animal> eligibleAnimal = getEligibleRacingAnimals(animalList);
        if (eligibleAnimal == null || eligibleAnimal.isEmpty()) {
            return null; // Trả về null nếu danh sách rỗng hoặc null
        }

        Animal winner = animalList.get(0);
        for (Animal animal : eligibleAnimal) {
            if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal; // Cập nhật người chiến thắng nếu tìm thấy Animal có speed lớn hơn
            }
        }


        return  winner;
    }
    private List<Animal> getEligibleRacingAnimals(List<Animal> animalList){
        List<Animal> eligibleAnimal = new ArrayList<>();
        for (Animal animal : animalList) {
            if(!animal.isFlyable()){
                eligibleAnimal.add(animal);
            }
        }
        return eligibleAnimal;
    }
}
