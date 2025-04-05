package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects konets = new TrainMethodsObjects();
        Mouse mouse15 = new Mouse("Буся", 42);
        konets.processMouse(mouse15);
        Souce garlic = new Souce("Чеснокыш", "Белый");
        konets.processSouce(garlic);
        Bee zuza = new Bee("unisex", 34);
        konets.processBee(zuza);
        Obstacle issueNew = new Obstacle("Wrong image", "P4");
        konets.processObstacle(issueNew);
        Pineapple ananas = new Pineapple("Кислый", 5000.05);
        konets.processPineapple(ananas);
    }
}
