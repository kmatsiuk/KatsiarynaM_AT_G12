package pretask;
//используйте цикл for, чтобы вывести четные числа от 1 до 10,
// с использованием условного оператора if для пропуска нечетных чисел
public class ConditionalLoopExample {
    public static void main(String[] args) {
        int a;
        for (a = 1; a <=10; a++) {
            if (a % 2 == 0)
                System.out.println(a);
        }
    }
}
