package ZZZZZJavaHeritage.com.heritage;

public abstract class Vehicle {

	 private String brand;
	 private int kilometers;
	 
	 public Vehicle() {}
	 public Vehicle(String brand, int kilometers) {
		 this.brand = "subaru";
		 this.kilometers = 300;
	 }

	 public abstract String doStuff();
		 
	 public String getBrand() {
		 return brand;
	 }

	 public void setBrand(String brand) {
		 this.brand = brand;
	 }

	 public int getKilometers() {
		 return kilometers;
	 }

	 public void setKilometers(int kilometers) {
		 this.kilometers = kilometers;
	 }
}
