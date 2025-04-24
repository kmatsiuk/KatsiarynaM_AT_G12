package homework.day4.playground.essence;

import java.io.Serializable;

public class Matter implements Serializable {
    protected int mass;

    public Matter(int mass) {
        this.mass = mass;
    }

    public Matter() {

    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
