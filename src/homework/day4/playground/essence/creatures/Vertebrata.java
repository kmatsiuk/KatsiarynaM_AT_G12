package homework.day4.playground.essence.creatures;

public abstract class Vertebrata extends Animal {
    public void eat (Insect food) {
        System.out.printf("I am %s and I am eating %s", name, food.getName()); //food get name потому что Plant name в другом классе?
    }
}
