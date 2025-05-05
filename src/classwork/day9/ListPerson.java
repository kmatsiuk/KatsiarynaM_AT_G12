package classwork.day9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListPerson {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            Person per = list.get(i);
            if ((per.sex == Person.Sex.MAN && per.age <= 60 && per.age > 18) |
                    (per.sex == Person.Sex.WOMEN && per.age <= 55 && per.age > 18)) {
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println(list.stream().filter(per -> (per.sex == Person.Sex.MAN && per.age <= 60 && per.age > 18) |
                (per.sex == Person.Sex.WOMEN && per.age <= 55 && per.age > 18)).count());

        //Отсортировать коллекцию людей сначала по полу, а потом по возрасту, вывести
        //результат в консоль и вернуть результирующую коллекцию
        System.out.println(list.stream().
                sorted((p1, p2) -> {
                            if (p1.sex == p2.sex) {
                                return p1.age - p2.age;
                            } else {
                                return p1.sex.compareTo(p2.sex);
                            }
                }).toList());

        System.out.println(list.stream().min(Comparator.comparingInt(p -> p.age)));
    }
}
