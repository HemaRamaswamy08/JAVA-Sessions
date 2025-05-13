package array_example;

import java.util.Scanner;

public class StringNumberArray {
	Scanner sc = new Scanner(System.in);

	public StringNumberArray() {

		System.out.println("Enter the size of a Bucket :");
		int size = sc.nextInt();
		String[] fruits = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Fruit:");
			fruits[i] = sc.next();
		}

		System.out.println("fruits in the basket are :");

		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
		

	}
	
	public StringNumberArray(int choice) {
		System.out.println("Enter the size of an array :");
		int size = sc.nextInt();
		int[] userNumber = new int[size];
		System.out.println("Enter the values of an array:");
		for (int i = 0; i < size; i++) {
			userNumber[i] = sc.nextInt();
		}
		
		System.out.println("Numbers are :");
		int sum=0;

		for (int i = 0; i < userNumber.length; i++) {
			System.out.print(userNumber[i] + " ");
			sum+=userNumber[i] ;
		}
		System.out.println(" ");
		System.out.println("sum of numbers " + sum);
		
	}
	
}
