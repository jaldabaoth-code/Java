package Inheritance;

/* Child */
public class Boat extends Vehicle {
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        System.out.println("When it is a boat");
        String message = " - I am a \"" + getBrand() + "\" I browsed " + getKilometers() + " kilometers and I do glou glou !";
        return message;
    }
}
