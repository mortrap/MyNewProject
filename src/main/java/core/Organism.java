package core;

public class Organism {
    private boolean isLife;
    private boolean isTouch;

    public Organism(boolean isLife, boolean isTouch) {
        this.isLife = isLife;
        this.isTouch = isTouch;
    }

    public boolean getIsLife() {
        return isLife;
    }

    public void setIsLife(boolean isLife) {
        this.isLife = isLife;
    }

    public boolean getIsTouch() {
        return isTouch;
    }

    public void setIsTouch(boolean isTouch) {
        this.isTouch = isTouch;
    }
}
