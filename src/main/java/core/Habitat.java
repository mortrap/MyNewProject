package core;

public class Habitat {
    public static void main(String[] args) {
        Virus virus = new Virus(true, false, "flu", "temperance", 2,
                "airborne, mucous", "animals" );
        Virus newVirus = new Virus (true, false, "distemper", "temperance", 1,
                "mucous", "animals" );
        System.out.println("virus.hashCode() = " + virus.hashCode());
        System.out.println("newVirus.hashCode() = " + newVirus.hashCode());
        System.out.println("virus.equals(newVirus) = " + virus.equals(newVirus));
        Animal bat = new Animal(true, true, "mammals bats", 2, "different",
                true, false);
        System.out.println("bat.infectionProbability() = " + bat.infectionProbability());
        System.out.println(bat.lookInfectionProbability());
    }
}


