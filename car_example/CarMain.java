package car_example;

public class CarMain {
	
public static void main(String[] args) {
	Car car = new Car();
	
	System.out.println(car.getSpeed());
	
	car.accelerate();
	car.accelerate();
	System.out.println(car.getSpeed());
	car.accelerate();
	
	System.out.println(car.getSpeed());
	car.brake();
	System.out.println(car.getSpeed());
}

}
