package assesments;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check Palindrome condition:");
		int originalNum = sc.nextInt();
		int num = originalNum;
		int reversed=0;
		while (num != 0) {
			int digit = num %10;
			reversed = reversed*10 + digit;
			num = num/10;
		}
		if(originalNum == reversed) {
			System.out.println("It is a Palindrome ");
		}else{
			System.out.println("It is NOT a  Palindrome");
		}
		
		
		sc.close();

	}
}
