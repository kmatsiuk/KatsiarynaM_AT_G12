package homework.day8.hw;

import java.util.ArrayList;
import java.util.List;

public class RunnerButterflies {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        butterflies.stream().map(add -> "\"" + add+ "\"")
                .filter(cont -> cont.contains("o") && cont.contains("a"))
                .forEach(System.out::println);
    }
}
