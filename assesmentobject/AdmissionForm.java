package assesmentobject;

public class AdmissionForm {
	String studentName;
	int age;
	String courseApplied;
	long contactNumber;

	public static void main(String[] args) {
		AdmissionForm priyasForm = new AdmissionForm();
		priyasForm.studentName = "Priya";
		priyasForm.age = 21;
		priyasForm.courseApplied="Computer Science";
		priyasForm.contactNumber = 6362749053l;
		
		System.out.println("STUDENT DETAILS");
		System.out.println("----------------------------------------");
		System.out.println("Student Name :" +priyasForm.studentName );
		System.out.println("Age  :"+priyasForm.age);
		System.out.println("Course Applied  :"+priyasForm.courseApplied);
		System.out.println("Contact number :"+priyasForm.contactNumber);

	}

}
