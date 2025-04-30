package college_inheritance_exmple;

public class MathsTeacher extends Teacher {
	
	public double allowance;

	public MathsTeacher(String name, int age, String email, double salary, String subject,double allowance) {
		super(name, age, email, salary, subject);
		this.allowance = allowance;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Allowance : "+allowance);
		
	}
	

}
