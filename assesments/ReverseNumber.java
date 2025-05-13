package assesments;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to reverse:");
		int num = sc.nextInt();
		int rev;
		int result=0;
//MATHOD 1:
//		while(num!=0) {
//			rev = num %10;
//			num = num/10;
//			System.out.print(rev);
//		}
		//METHOD 2:
		while(num!=0) {
			rev = num%10;
			result =result*10 +rev;
			num = num/10;
		}
		System.out.println(result);
		sc.close();
	}
}
