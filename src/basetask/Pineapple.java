package basetask;

public class Pineapple {
    String grade;
    double heatCapacity;

    public Pineapple(String grade, double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public static void main(String[] args) {
        Pineapple pino = new Pineapple();
        pino.setGrade("Yellow");
        pino.setHeatCapacity(25.95);
        pino.printPineappleDetails();
    }

    public void printPineappleDetails () {
        if (heatCapacity > 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасется больше :(");
        }
    }
    public Pineapple() {
    }
}
