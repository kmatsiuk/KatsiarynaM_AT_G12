package basetask;

public class Souce {
    String name;
    String color;

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Souce chilli = new Souce("Чили", "red");
        chilli.setColor ("red");
        chilli.setName("Чили");
        chilli.printSouceDetails();
        }
    public void printSouceDetails() {
        System.out.println("Этот соус " + name + " и он " + color + " цвета");
    }
    }
