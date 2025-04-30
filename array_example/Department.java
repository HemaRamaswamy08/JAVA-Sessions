package array_example;

public class Department {
	
	public int id;
	String name;
	public static int count=0;

	
	public Department(String name) {
		this.name=name;
		this.id= generateId();
	}
	@Override
	public String toString() {
		return "Department ID :"+this.id +" Department name :"+this.name;
	}
	
	private int generateId() {
		Department.count = Department.count+1;
		return Department.count ;
	}
	

}
