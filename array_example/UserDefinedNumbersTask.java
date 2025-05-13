package array_example;

import java.util.Scanner;

public class UserDefinedNumbersTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
		sc.close();
	}

}
