package college_inheritance_exmple;

public class Teacher extends Person{
	
	public double salary;
	public String subject;

	public Teacher(String name, int age, String email,double salary,String subject) {
		super(name, age, email);
		this.salary=salary;
		this.subject=subject;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Salary : "+salary);
		System.out.println("Subject :" + subject);
	}

}
