package homework.day4.playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat (Insect food) {
        System.out.printf("I am %s and I am eating %s\n", name, food.getName()); //food get name потому что Plant name в другом классе?
    }
}
