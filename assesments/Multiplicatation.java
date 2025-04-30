package assesments;

import java.util.Scanner;

public class Multiplicatation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numbers for multiplicatation :");
		int mult = sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(mult+"X"+i+"="+mult*i);
			i++;
		}
		sc.close();
	}
}
