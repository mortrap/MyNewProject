package core;

public class Habitat {
    public static void main(String[] args) {
        Virus virus = new Virus(true, false, "flu", "temperance",
                "airborne", "peoples and animals" );
        Virus newVirus = new Virus (true, false, "fle", "temperance",
                "contact", "peoples" );
        System.out.println("virus.hashCode() = " + virus.hashCode());
        System.out.println("newVirus.hashCode() = " + newVirus.hashCode());
        System.out.println("virus.equals(newVirus) = " + virus.equals(newVirus));
    }
}


