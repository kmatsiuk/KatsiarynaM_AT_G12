package homework.day8.hw;

import java.util.Objects;

public class Sand {
    private int weight;
    private String name;

    public Sand(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sand sand)) return false;
        return weight == sand.weight && Objects.equals(name, sand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }

    @Override
    public String toString() {
        return "Sand{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
