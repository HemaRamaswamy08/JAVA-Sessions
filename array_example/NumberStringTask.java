package array_example;

import java.util.Scanner;

public class NumberStringTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the type of an array you want :");
		System.out.println("1. String");
		System.out.println("2. Integer");
		int choice =0;
		do {
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
		}while(choice<=0 || choice>3 );
		
		if(choice ==1) {
			new StringNumberArray();
		}else {
			new StringNumberArray(1);
		}
		
			
		sc.close();
	}
}
