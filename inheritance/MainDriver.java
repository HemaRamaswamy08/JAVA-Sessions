package inheritance;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();

		child.bike(); // only accessible from child

		child.plotPrice();

		child.sayHello();

	}

}
