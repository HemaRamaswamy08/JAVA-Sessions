package college_inheritance_exmple;

public class Person {

	public static int id = 1;
	public String name;
	public int age;
	public String email;

	public Person(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public static int ageGenerate() {
		return id ++;
	}

	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Id :" + ageGenerate());
		System.out.println("Age :" +age);
	}

}
