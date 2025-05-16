package homework.day1.basetask;

public class TrainMethodsIf {
    public int returnNewInt(int a) {
        if (a < 8) {
            return a * 7;
        } else {
            return a / 4;
        }
    }

    public long returnNewLong(long a) {
        if (a > 300) {
            return a - 300;
        } else {
            return a + 20;
        }
    }
    public String returnNewChar(char a) {
        if (a == 'g') {
            return "go";
        } else {
            return "o" + a;
        }
    }

    public float returnNewFloat (float a) {
        if (a == 0.67f) {
            return a;
        } else {
            return a * 2;
        }
    }

    public double returnNewDouble (double a) {
        if (a > 30 && a < 80) {
            return a + 87;
        } else if (a > 80 && a < 400) {
            return a / 4;
        } else {
            return a;
        }
    }

    public void returnNewBoolean (boolean a) {
        if (a) {
            System.out.println("Я получил на вход значение истины");
        }
        else {
            System.out.println("Я получил на вход ложь");
        }
    }
}