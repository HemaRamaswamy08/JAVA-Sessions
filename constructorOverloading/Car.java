package constructorOverloading;

public class Car {
	String carName;
	String model;

	public Car(String name, String model) {
		this.carName = name;
		this.model = model;
	}

	public String toString() {
		return "Car : " + carName+"\n Model :"+model;
	}
	

}
