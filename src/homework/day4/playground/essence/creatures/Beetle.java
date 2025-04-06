package homework.day4.playground.essence.creatures;

public abstract class Beetle extends Insect {

    public void nest (Carrot home) {
        if (this.getMass() < home.getMass()) {
            int odds = this.getMass() / home.getMass(); //this потом
            System.out.printf("I am %s and I will nest there with %d my family members!", name, odds);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
        }
    }
