package car_example;

public class Car {
	private int speed;

	public void accelerate() {
		this.speed += 10;
	}

	public void brake() {
		if ((this.speed - 10) < 0) {
			this.speed = 0;
		} else {
			this.speed -= 10;
		}
	}

	public int getSpeed() {
		return speed;
	}

}
