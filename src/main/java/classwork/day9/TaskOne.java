package classwork.day9;

import java.util.Arrays;
import java.util.List;

public class TaskOne {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        //long counts = list.stream().filter(t -> t.equals("мама")).count(); тоже самое что:
        long counts = list.stream().filter("мама"::equals).count();
        System.out.println(counts);

        System.out.println(list.stream().findFirst().orElse("мама"));

        System.out.println(list.stream().filter("мама"::equals).findFirst().get());

        System.out.println(list.stream().skip(4).findFirst().orElse("bugagashechka"));

        System.out.println(list.stream().filter(x -> x.contains("м")).distinct().toList());

        //03.05.2025
        System.out.println(list.stream().anyMatch(match -> match.equals("мама")));

        System.out.println(list.stream().allMatch(cont -> cont.contains("м")));

        System.out.println(list.stream().map(adding -> adding+"М").toList());

        System.out.println(list.stream().flatMap(aCont -> Arrays.stream(aCont.split("а"))).filter(
                x -> !x.equals("")).toList());

        System.out.println(list.stream().sorted().toList());

        System.out.println(list.stream().sorted((cont1, cont2) -> -cont1.compareTo(cont2)).toList());

        System.out.println(list.stream().flatMap(x -> Arrays.stream(x.split("")))
                .peek(System.out::print)
                .max(String::compareTo));
    }
}
