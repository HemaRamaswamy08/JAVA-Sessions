package acessSpecifiers;

public class AcessSpecifierss {
	
	String passwordTwo = "Music@234";
	private String password = "Hema@20040120";
	String userName = "Hemavathi";
	
	public void info(String user,String pass) {
		this.userName = user;
		this.password = pass;
		System.out.println("User name :" + this.userName+ "Password : "+ this.password );
	}
	

}
