package inheritance;

public class Child extends Parent{
	
	int plotPrice = 80000;
	
	public void bike() {
		System.out.println("Child bought a bike");
	}
	@Override
	public void sayHello() {
		System.out.println("Hello from child");
		super.sayHello();
	}
	
	public void plotPrice() {
		System.out.println("Plot price when my father bought " + super.plotPrice);
		System.out.println("Current price of the plot :" +plotPrice );
	}
}
