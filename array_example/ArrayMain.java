package array_example;

public class ArrayMain {

	public static void main(String[] args) {
		int numbers[] = { 10, 20, 30, 40, 50 };
		for(int i=0; i< numbers.length; i++){
		
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println(" ");
		System.out.println("Length of this aray :"+numbers.length); //in array length is variable
		
		int [] evenNumbers = {2,4,6,8,10};
		System.out.println(evenNumbers[2]);
		
		float [] decimalnumber = {2.4f,6.8f};
		System.out.println(decimalnumber[0]);
		System.out.println(decimalnumber[1]);
		
		System.out.println("using while loop");
		int len = evenNumbers.length;
		int j=0;
		while(j <len) {
			System.out.println(evenNumbers[j]);
			j++;
		}
		
		System.out.println("using do-while loop");
		int lenDeci = decimalnumber.length;
		int k=0;
		
		do {

			System.out.println(evenNumbers[k]);
			k++;
		}while(k<lenDeci);
		
		

	}
}
