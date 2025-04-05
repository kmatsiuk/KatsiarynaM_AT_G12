package basetask;

public class Mouse {
    String name;
    int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName () {
        return name;
    }

    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("Жужа", 5);
        System.out.println("Я мышь, меня зовут " + mouse1.getName() + " и мне " + mouse1.getAge() +" лет.");

        mouse1.setAge(6);
        mouse1.setName("Мыша");
        mouse1.printMouseDetails();
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + name + " и мне " + age + " лет.");
    }
}
