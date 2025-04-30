package string_example;

public class MainDriver {
	public static void main(String[] args) {
		String fruit = "Apple";
		String name = new String("Apple");
		
		System.out.println(fruit == name); //false -->fruit address is stored in SCP , name as object adrs
		System.out.println(fruit.equals(name)); //true -->compares the values
		
		System.out.println("=====================");
		
		String firstName = "Hema"; 
		String lastName = "Hema"; //since value(Hema) is already is stored in SCP for lastName also same address is given
		System.out.println(firstName == lastName);
		System.out.println(firstName.equals(lastName));
		
		System.out.println("=====================");
		
		String word = "Java";
		//creates a new string "Java Rules" but does not change word
		word.concat("Rules");
		System.out.println(word);
	

}
}
