import oop.Human;
import oop.Person;
import oop.Programmer;

public class App {
    public static void main(String[] args) {
        Human person = new Person("Вася", 20);
        Human programmer=new Programmer("Петя", 25, 100);

        print(person);
        print(programmer);
    }

    private static void print(Human human){
        System.out.println(human.say());
    }
}
