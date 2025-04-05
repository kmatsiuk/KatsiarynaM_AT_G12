package bubbles;

public class Bubble {
    private final double volume = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void pop() {
        System.out.println("Cramp!");
    }
}
