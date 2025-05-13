package progamiz;

import java.util.Scanner;

public class Pract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of triangle");
		float length = sc.nextFloat();
		System.out.println("Enter Bredth od triangle");
		float bredth = sc.nextFloat();
		float area = (length * bredth) / 2;
		System.out.println("Area of trangle :" + area);
		sc.close();
	}
}
