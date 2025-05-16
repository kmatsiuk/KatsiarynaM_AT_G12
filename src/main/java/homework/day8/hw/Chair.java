package homework.day8.hw;

import java.util.Objects;

public class Chair {
    private int volume;
    private int width;

    public Chair(int volume, int width) {
        this.volume = volume;
        this.width = width;
    }

    public int getVolume() {
        return volume;
    }

    public int getWidth() {
        return width;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "volume=" + volume +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Chair chair)) return false;
        return volume == chair.volume && width == chair.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, width);
    }
}
