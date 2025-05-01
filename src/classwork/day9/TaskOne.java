package classwork.day9;

import java.util.ArrayList;
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

        List<String> result = new ArrayList<>();
        long limit = 2;
        long toSkip = 2;
        for (String s : list) {
            if (toSkip > 0) {
                toSkip--;
                continue;
            }
            if (limit-- == 0) break;
            result.add(s);
        }
        System.out.println(result);

        System.out.println(list.stream().filter(x -> x.contains("м")).distinct().toList());
    }
}
