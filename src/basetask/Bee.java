package basetask;

public class Bee {
    String gender;
    long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public Bee() {
        // пустой конструктор
    }

    public String getGender() {
        return gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Bee biba = new Bee ();
        biba.setGender("female");
        biba.setWeight(5L);
        biba.printBeeDetails();
    }

    public void printBeeDetails() {
        System.out.println("Я легче лося в " + (500 / weight) + " раз");
    }
}
