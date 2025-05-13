package array_example;

import java.util.Scanner;

public class FruitsTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
		sc.close();

	}

}
