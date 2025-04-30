package assesments;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int nextTerm;
		int count=1;
		
		do {
			System.out.println(num1);
			nextTerm = num1+num2;
			num1= num2;
			num2=nextTerm;
			count++;
		} while (count<=10);
	
	}
}
