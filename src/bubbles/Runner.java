package bubbles;

public class Runner {
    public static void main(String[] args) {
        SparklingWater water1 = new SparklingWater();
        SparklingWater water2 = new SparklingWater();
        SparklingWater water3 = new SparklingWater();

        water1.pump(createBubbles(0.5));
        water2.pump(createBubbles(1.0));
        water3.pump(createBubbles(1.5));

        Bottle bottle1 = new Bottle(0.5, water1);
        Bottle bottle2 = new Bottle(1.0, water2);
        Bottle bottle3 = new Bottle(1.5, water3);

        System.out.println("Готово! Все бутылки наполнены пузырьками.");
    }

    public static Bubble[] createBubbles(double liters) {
        int count = (int) (liters * 10000);
        Bubble[] bubbles = new Bubble[count];
        for (int i = 0; i < count; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        return bubbles;
    }
}