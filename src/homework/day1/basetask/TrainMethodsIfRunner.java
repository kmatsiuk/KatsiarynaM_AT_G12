package homework.day1.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf objectA = new TrainMethodsIf();

        int result1 = objectA.returnNewInt(4);
        System.out.println("метод returnNewInt вернул " + result1);

        long result2 = objectA.returnNewLong (305L);
        System.out.println("метод returnNewLong вернул " + result2);

        String result3 = objectA.returnNewChar('p');
        System.out.println("метод returnNewChar вернул " + result3);

        float result4 = objectA.returnNewFloat(0.5f);
        System.out.println("метод returnNewFloat вернул " + result4);

        double result5 = objectA.returnNewDouble(50);
        System.out.println("метод returnNewDouble вернул " + result5);

        objectA.returnNewBoolean(false);
    }
}
