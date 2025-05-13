package methods;

public class Student {
	String name;
	String grade;
	String section;
	static String schoolName = "New School";
	
	public void isRegistered() {
		System.out.println("Student is registered");
		System.out.println("this method is called using object reference");
	}
	static public void isStatic() {
		System.out.println("This is static method call using class name");
	}
}
