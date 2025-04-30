package practice.task.student;

public class Student extends Person {
	public static String grade;
	public int marks;
	
	//constructor is created in order to inherit prop from parent class (Person)
	public Student(String name, int age, String email,int marks) {
		//to inherit values from parent class
		super(name, age, email);
		this.marks=marks;
	}
	
	//to generate grade based on marks
	public static String generateMarks(int marks) {
		if(marks>90) {
			grade = "A";
		}else if(marks>=80 && marks<=90) {
			grade = "B";
		}else {
			grade = "C";
		}
		return grade;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Marks :"+marks);
		System.out.println("Grade :"+generateMarks(marks));
	}
	
	

}
