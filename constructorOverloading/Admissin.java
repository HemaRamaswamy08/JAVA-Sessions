package constructorOverloading;

public class Admissin {
	public static void main(String[] args) {
		Students students = new Students(25,"Hema","hema4362@gmail.com");
		//this lines will have null values if there is no this keyword
		System.out.println("id : "+students.id);
		System.out.println("Name : "+students.name);
		System.out.println("Email : "+students.email);
		
		System.out.println("======================================");
		// from class named EmployeeDetails
		EmployeeDetails emp = new EmployeeDetails(113, "Hemaaa", "hema@43gmail.com", "Backend", "987654320");
		System.out.println("Employee ID :"+ emp.empId);
		System.out.println("Employee Name :"+ emp.empName);
		System.out.println("Employee Email :"+ emp.empEmail);
		System.out.println("Employee Department :"+ emp.deptName);
		System.out.println("Employee Number :"+ emp.mobileNum);
		
		EmployeeDetails secondEmployee = new EmployeeDetails();
		secondEmployee.empId=12;
		secondEmployee.empName="nisha";
		secondEmployee.empEmail = "nisha@go.com";
		System.out.println("======================================");
		System.out.println("Printing Details from method ");
		secondEmployee.printDetails();
		
		System.out.println("======================================");
		// this  for toString
		System.out.println(secondEmployee);
		
		
		
		
		
	
}
}
