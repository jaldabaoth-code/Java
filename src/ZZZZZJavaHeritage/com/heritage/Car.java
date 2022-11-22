package ZZZZZJavaHeritage.com.heritage;

public class Car extends Vehicle {
	
	public Car() {}
	public Car(String brand, int kilometers) {  
		super(brand, kilometers);
    }


    @Override
    public String doStuff() {
    	setBrand("Clio");
    	String message = "Je suis " + this.getBrand() + " et je fais vroum vroum !";
    	return message;
    }
}
