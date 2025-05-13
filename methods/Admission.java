package methods;

public class Admission {
	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.name="Hema";
		stu.grade="A";
		stu.section = "B Section";
		
		
		System.out.println("Student Name :" + stu.name);
		System.out.println("Student grade :" + stu.grade);
		System.out.println("Student section :" + stu.section);
		System.out.println("School name :" + Student.schoolName);//static variable
		
		stu.isRegistered();//non-static method
		
		Student.isStatic();//static method call by class
		
	}
}
