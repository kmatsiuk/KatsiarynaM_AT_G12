package homework.day4.playground.essence.craft.hand;

import homework.day4.playground.essence.material.Pourable;

public class Bottle extends Container implements Storable {
    public Bottle(int mass, String name) {
        super(mass, name);
    }

    public void store(Pourable pourable, int amount) {
        System.out.printf("I am %s, my name is %s and I received %d of %s\n", this.getClass().getSimpleName(), this.name, amount, pourable.getClass().getSimpleName());
        if (amount > this.mass) {
            System.out.println ("wooh-wooh-wooh-hh..");
        }
    }

}
