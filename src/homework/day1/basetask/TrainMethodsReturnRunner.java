package homework.day1.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn objectA = new TrainMethodsReturn();

        int result = objectA.returnNewInt(3);
        System.out.println("метод returnNewInt вернул " + result);

        long longResult = objectA.returnNewLong (27L);
        System.out.println("метод returnNewLong вернул " + longResult);

        float floatResult = objectA.returnNewFloat(23.4F);
        System.out.println("метод floatResult вернул " + floatResult);

        double doubleResult = objectA.returnNewDouble(542.999);
        System.out.println("метод doubleResult вернул " + doubleResult);

        short shortResult = objectA.returnNewShort((short) 120);
        System.out.println("метод returnNewShort вернул " + shortResult);

        byte byteResult = objectA.returnNewByte((byte) 50);
        System.out.println("метод returnNewByte вернул " + byteResult);

        boolean booleanResult = objectA.returnNewBoolean(true);
        System.out.println("метод returnNewBoolean вернул " + booleanResult);
    }

}
