package college_inheritance_exmple;

public class College {

	public static void main(String[] args) {
		MathsTeacher mathsTeacher = new MathsTeacher("Hema",28,"hema@gmail.com",80000,"Maths",2000);
		mathsTeacher.display();
		System.out.println("----------------------------------");
		MathsTeacher mathsTeacher2 = new MathsTeacher("Nish",30,"nisargaRamesh@gmail.com",86000,"Maths",5000);
		mathsTeacher2.display();
		System.out.println("------------------");
		Teacher englishTeacher = new Teacher("Rakshi",45,"Rakshithabr1997@gmail.com",90000,"English");
		englishTeacher.display();
	}

}
