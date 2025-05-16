package homework.day7;

public class GenericMethodsInGenericClassT<T> {
    void genericMethodOneGenArg(T t) { //может быть любая буква?
        System.out.printf("I am an object of %s class\n", t.getClass().getSimpleName()); //%s не правильно? типа я еще не знаю сама это стринг или нет?
    }
    public String genericMethodTwoGenArgs(T a, T b) {
        return String.format("We are objects of %s class and %s class\n", a.getClass().getSimpleName(), b.getClass().getSimpleName());
    }
    void genericMethodHalfGenArgs(T c, String line) {
        int num = line.length();
        System.out.printf("I got an object of %s class and string with %d characters\n", c.getClass().getSimpleName(), num);
    }
}
