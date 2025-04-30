package progamiz;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the coefficient of euatation i.e a,b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double root1, root2;
		System.out.println("coefficient are a:" + a + " b:" + b + " c:" + c);
		float discriminant = (b * b) - (4 * a * c);
		if (discriminant > 0) {
			root1 = (-b + (Math.sqrt(discriminant))) / 2 * a;
			root2 = (-b - (Math.sqrt(discriminant))) / 2 * a;
			System.out.println("Roots are real and distinct");
			System.out.println("Root 1 :" + root1);
			System.out.println("Root 2 :" + root2);

		} else if(discriminant ==0){
			root2 = (-b - (Math.sqrt(discriminant))) / 2 * a;
			root1 = root2;
			System.out.println("Roots are equal");
			System.out.println("Root 1 :" + root1);
			System.out.println("Root 2 :" + root2);
		}
		sc.close();
	}

}
