package core;

public class Organism {
    private boolean isLife;
    private boolean isTouch;
    public Organism (boolean isLife, boolean isTouch){
        this.isLife=isLife;
        this.isTouch=isTouch;
    }

    public boolean isLife() {
        return isLife;
    }

    public void setLife(boolean life) {
        isLife = life;
    }

    public boolean isTouch() {
        return isTouch;
    }

    public void setTouch(boolean touch) {
        isTouch = touch;
    }
}
