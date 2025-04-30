package constructorOverloading;

public class EmployeeDetails {
	public int empId;
	public String empName;
	public String empEmail;
	public String deptName;
	public String mobileNum;
	
	public EmployeeDetails(int empId,String empName,String empEmail,String deptName,String mobileNum){
		//all Arguments constructor
		this.empId=empId;
		this.empName=empName;
		this.deptName = deptName;
		this.empEmail=empEmail;
		this.mobileNum = mobileNum;
		
	}
	
	public EmployeeDetails(int empId,String empName,String empEmail) {
		this.empId=empId;
		this.empName=empName;
		this.empEmail=empEmail;
		
	}
	
	public EmployeeDetails() {
		
	}
	
	public void printDetails() {
		System.out.println(" Id : "+this.empId);
		System.out.println(" EmpName : "+this.empName);
		System.out.println("Email : "+this.empEmail);
		
	}
	// Instead of the above method we can also use below approach 
	@Override
	public String toString() {
		return "id: " + this.empId + ", name: " + this.empName;
	}
	
	

}
