package hybrid_inheritance;

public class Main {

	public static void main(String[] args) {
		Children children = new Children();
		children.car();
		children.property();
		children.info();
		System.out.println("--------------------");
		Wife wife = new Wife();
		wife.car();
		wife.property();
		wife.info();

	}

}
