package homework.day7;

import homework.day4.playground.essence.craft.field.Car;
import homework.day4.playground.essence.craft.hand.Container;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> stringObj = new GenericMethodsInGenericClassT();
        GenericMethodsInGenericClassT<Integer> intObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> carObj = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Container> contObj = new GenericMethodsInGenericClassT<>();

        stringObj.genericMethodOneGenArg("sheeeesh");
        stringObj.genericMethodHalfGenArgs("okay", "letsgo");
        String result = stringObj.genericMethodTwoGenArgs("a", "b");
        System.out.println(result);

        intObj.genericMethodOneGenArg(4);
        intObj.genericMethodHalfGenArgs(54, "line");
        String result2 = intObj.genericMethodTwoGenArgs(15, 67); //почему нельзя Int result2 - public String метод
        System.out.println(result2);

        doubleObj.genericMethodOneGenArg(43.3);
        doubleObj.genericMethodHalfGenArgs(6564.4, "night");
        String result3 = doubleObj.genericMethodTwoGenArgs(13.4, 423.0);
        System.out.println(result3);

        carObj.genericMethodOneGenArg(new Car(2300, "Honda"));
        carObj.genericMethodHalfGenArgs(new Car(5432, "BMW"), "car names");
        String result4 = carObj.genericMethodTwoGenArgs(new Car(432, "Subaru"), new Car(5424, "Tachka"));
        System.out.println(result4);

        contObj.genericMethodOneGenArg(new Container(11, "Cup"));
        contObj.genericMethodHalfGenArgs(new Container(3, "Shot"), "1");
        String result5 = contObj.genericMethodTwoGenArgs(new Container(2, "Pup"), new Container(43235, "Pool"));
        System.out.println(result5);
    }
}
