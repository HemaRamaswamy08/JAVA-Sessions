package practice.task.student;

public class Person {
	
	//declaring a variable
	public static int id = 1; //in order to auto increment static is used
	public String name;
	public int age;
	public String email;
	
	public Person(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	//to generate automatic id
	public static int ageGenerate() {
		return id ++;
	}
	
	//to display informatation 
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Id :" + ageGenerate());
		System.out.println("Age :" +age);
		System.out.println("Email :" + email);
	}

}
