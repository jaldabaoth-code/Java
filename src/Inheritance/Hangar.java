package Inheritance;

/* Quest : Inheritance */
public class Hangar {
    /* Main method that can run the quest Inheritance */
    public static void main(String[] args) {
        System.out.println("\n--- Quest : Inheritance  ---");
        System.out.println(new Car("Clio", 19000).doStuff());
        System.out.println(new Boat("Titanic", 200000).doStuff());
    }
}
