package string_example;

public class BuilderBufferExample {
	public static void main(String[] args) {
		StringBuffer  firstName = new StringBuffer("Hema");
		firstName.append(" Ramaswamy");
		System.out.println(firstName);
		
		StringBuilder nickName = new StringBuilder("Sangeetha");
		nickName.append(" B R");
		System.out.println(nickName);
	}

}
