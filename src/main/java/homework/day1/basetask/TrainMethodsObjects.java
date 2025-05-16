package homework.day1.basetask;

public class TrainMethodsObjects {
    public static void main(String[] args) {
        Mouse mouse3 = new Mouse("Копа", 2);
        TrainMethodsObjects handler = new TrainMethodsObjects();
        handler.processMouse(mouse3);

        Souce tartar = new Souce ("Тартар", "Белый");
        handler.processSouce(tartar);

        Bee pipa = new Bee("male", 64L);
        handler.processBee(pipa);

        Obstacle issue42 = new Obstacle("503 bad gateway", "P3");
        handler.processObstacle(issue42);

        Pineapple pino = new Pineapple ("Free", 4000);
        handler.processPineapple(pino);
    }

    public void processMouse(Mouse mouse2) {
        System.out.println("Имя мыши: " + mouse2.getName());
        System.out.println("Возраст мыши: " + mouse2.getAge());
        mouse2.printMouseDetails();
    }

    public void processSouce(Souce tartar) {
        System.out.println("Имя соуса: " + tartar.getName());
        System.out.println("Цвет соуса: " + tartar.getColor());
        tartar.printSouceDetails();
    }

    public void processBee (Bee pchol) {
        System.out.println("Пол пчелы: " + pchol.getGender());
        System.out.println("Вес пчелы: " + pchol.getWeight());
        pchol.printBeeDetails();
    }

    public void processObstacle (Obstacle issue2) {
        System.out.println("Важность: " + issue2.getSeverity());
        System.out.println("Описание проблемы: " + issue2.getDescription());
        issue2.printObstacleDetails();
    }

    public void processPineapple (Pineapple pino) {
        System.out.println("Сорт: " + pino.getGrade());
        System.out.println("Теплоемкость: " + pino.getHeatCapacity());
        pino.printPineappleDetails();
    }
    }
