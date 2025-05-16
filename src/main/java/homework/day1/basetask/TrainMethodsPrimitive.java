package homework.day1.basetask;

public class TrainMethodsPrimitive {
    public static void printInt() {
        int a = 15;
        System.out.println("я получила на вход число" + " " + a);
    }

    public static void printLong() {
        long x = 1234567890L;
        System.out.println("я получила на вход  длинное число" + " " + x);
    }

    public static void printChar() {
        char b = ',';
        System.out.println("я получила на вход символ" + " " + b);
    }

    public void printFloat() {
        float c = 0.6f;
        System.out.println("я получил на вход дробное число " + c);
    }

    public void printDouble() {
        double d = 2434.6646432;
        System.out.println("я получил на вход длинное дробное число " + d);
    }

    public void printShort() {
        short e = 300;
        System.out.println("я получил на вход короткое число " + e);
    }

    public void printByte() {
        byte f = 126;
        System.out.println("я получил на вход очень короткое число " + f);
    }

    public void printBoolean() {
        boolean g = false;
        System.out.println("я получил на вход булево " + g);
    }
}

