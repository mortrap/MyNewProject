package core;

public class Animal extends Organism implements Infectable, Comparable<Animal> {
    private String type;
    private int immunityLevel;
    private String methodOfFoodExtraction;
    private boolean isCommunity;
    private boolean isInfection;

    public Animal(boolean isLife, boolean isTouch, String type, int immunityLevel, String methodOfFoodExtraction,
                  boolean isCommunity, boolean isInfection) {
        super(isLife, isTouch);
        this.type = type;
        this.immunityLevel = immunityLevel;
        this.methodOfFoodExtraction = methodOfFoodExtraction;
        this.isCommunity = isCommunity;
        this.isInfection = isInfection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethodOfFoodExtraction() {
        return methodOfFoodExtraction;
    }

    public void setMethodOfFoodExtraction(String methodOfFoodExtraction) {
        this.methodOfFoodExtraction = methodOfFoodExtraction;
    }

    public int getImmunityLevel() {
        return immunityLevel;
    }

    public void setImmunityLevel(int immunityLevel) {
        this.immunityLevel = immunityLevel;
    }

    public boolean getIsInfection() {
        return isInfection;
    }

    public void setIsInfection(boolean isInfection) {
        this.isInfection = isInfection;
    }

    public boolean getIsCommunity() {
        return isCommunity;
    }

    public void setIsCommunity(boolean isCommunity) {
        this.isCommunity = isCommunity;
    }

    @Override
    public double infectionProbability() {
        double mofe = 0;
        switch (this.methodOfFoodExtraction) {
            case "herbivorous":
                mofe = 1;
                break;
            case "predator":
                mofe = 2;
                break;
            case "different":
                mofe = 3;
                break;
        }
        double isc;
        if (!this.isCommunity) {
            isc = 0.5;
        } else {
            isc = 1.0;
        }
        if (this.isInfection) {
            return 1;
        }
        return (mofe + isc) / immunityLevel;
    }

    @Override
    public String lookInfectionProbability() {
        String str;
        if (this.isInfection) {
            str = "The body is already infected";
            return str;
        }
        if (infectionProbability() < 0.5) {
            str = "His Level of immunity is high you are unlikely to get infected ";
            return str;
        } else if (infectionProbability() > 0.5 && infectionProbability() < 1) {
            str = "His Level of immunity is average the probability of getting infected is average ";
            return str;
        } else {
            str = "This Organism of " + this.type + " type is not immune and will be infected quickly";
            return str;
        }
    }

    @Override
    public int compareTo(Animal t1) {
        int c;
        if (this.isInfection) {
            c = 1;
        } else {
            c = 0;
        }
        int k;
        if (t1.isInfection) {
            k = 1;
        } else {
            k = 0;
        }
        if (this.isInfection != t1.isInfection) {
            return c - k;
        } else {
            return 0;
        }
    }
}
