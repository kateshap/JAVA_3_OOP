package absrractClass;

public class AbstractApp {
    public static void main(String[] args) {
        Human programmer = new Person() {
            @Override
            public String say() {
                return "Hello from Person";
            }
        };

        System.out.println(programmer.say());
    }
}
