package encapsulatation_example;

public class Encapsulatation {

	private String name;
	private String email;
	private String phoneNum;
	
	public Encapsulatation(){
		
	}
	public Encapsulatation(String name,String email,String phoneNum) {
		this.name=name;
		this.email=email;
		this.phoneNum=phoneNum;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
}
