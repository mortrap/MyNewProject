package core;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class Habitat {
    public static void main(String[] args) {
        Virus virus = new Virus(true, false, "flu", "temperance", 2,
                "airborne, mucous", "animals");
        Virus newVirus = new Virus(true, false, "distemper", "temperance", 1,
                "mucous", "animals");
        System.out.println("virus.hashCode() = " + virus.hashCode());
        System.out.println("newVirus.hashCode() = " + newVirus.hashCode());
        System.out.println("virus.equals(newVirus) = " + virus.equals(newVirus));
        Animal bat = new Animal(true, true, "mammals bats", 2, "different",
                true, true);
        Animal snake = new Animal(true, true, "scaly reptiles", 2, "predator",
                false, false);
        Animal bat1 = new Animal(true, true, "mammals bats", 2, "different",
                true, false);
        System.out.println("bat.infectionProbability() = " + bat.infectionProbability());
        System.out.println(bat.lookInfectionProbability());
        System.out.println("virus.virusCondition(bat) = " + virus.virusCondition(bat));
        List<Animal> animalList = new ArrayList<>();
        Collections.addAll(animalList, bat, snake, bat1);
        Comparator<Animal> comparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal animal, Animal t1) {
                return animal.compareTo(t1);
            }
        };
        animalList.sort(Animal::compareTo);
        for (Animal animal:animalList
             ) {
            System.out.println(animal.getType() + " " + animal.getIsInfection());

        }
    }
}


