package practice.task.array.custom_array;

public class CustomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray arr = new MyArray();
		arr.add("apple");
		arr.add("cherry");
		arr.add("mango");
		arr.add("grapes");
		arr.add("Cheekoo");
		arr.display();
		arr.displayList();
		System.out.println(" at index 2 :"+arr.getString(2));
		
	}

}
