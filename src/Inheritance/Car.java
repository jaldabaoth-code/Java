package Inheritance;

/* Child */
public class Car extends Vehicle {
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        System.out.println("When it is a car");
        String message = " - I am a \"" + getBrand() + "\" I browsed " + getKilometers() + " kilometers and I do vroum vroum !";
        return message;
    }
}
