package homework.day4.playground.essence.craft.field;

public class Motorbike extends Vehicle{
    public Motorbike(int mass, String name) {
        super(mass, name);
    }
    public int move(int pointA, int pointB) {
        System.out.printf ("I am %s, my name is %s and I am moving from point %d to point %d\n", this.getClass().getSimpleName(), this.name, pointA, pointB);
        return pointB - pointA;
    }
}
