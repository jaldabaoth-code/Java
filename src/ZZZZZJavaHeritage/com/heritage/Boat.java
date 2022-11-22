package ZZZZZJavaHeritage.com.heritage;

public class Boat extends Vehicle {
	
	public Boat() {}
	public Boat(String brand, int kilometers) {  
		super(brand, kilometers);
    }

    @Override
    public String doStuff() {
    	setBrand("Titanic");
    	String message = "Je suis " + this.getBrand() + " et je fais glou glou !";
    	return message;
    }
}
