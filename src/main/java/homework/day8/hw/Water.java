package homework.day8.hw;

import java.util.Objects;

public class Water {
    String color;
    String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Water water)) return false;
        return Objects.equals(color, water.color) && Objects.equals(smell, water.smell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, smell);
    }

    @Override
    public String toString() {
        return "Water{" +
                "color='" + color + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }
}
