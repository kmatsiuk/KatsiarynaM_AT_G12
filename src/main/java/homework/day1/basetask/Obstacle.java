package homework.day1.basetask;

public class Obstacle {
    String description;
    String severity;

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void printObstacleDetails () {
        System.out.println("Возникло " + severity + " препятствие " + description);
    }

    public Obstacle() {
    }

    public static void main(String[] args) {
        Obstacle issue1 = new Obstacle();
        issue1.setDescription("потеря соединения");
        issue1.setSeverity("P1");
        issue1.printObstacleDetails();
    }
}
