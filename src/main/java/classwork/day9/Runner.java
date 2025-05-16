package classwork.day9;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        //mc.justMethod(string -> System.out.println(string)); тоже самое что:
        mc.justMethod(System.out::println);
    }
}
