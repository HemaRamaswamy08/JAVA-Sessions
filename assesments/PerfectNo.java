package assesments;

import java.util.Scanner;

public class PerfectNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check Perfect number or not :");
		int original = sc.nextInt();
		int num = original;
		int remainder =0;
		int total=0;
		for(int i=1; i<=(num/2); i++) {
			if(num % i ==0) {
				remainder =i;
				total+=remainder;
			}
		}
		if(total ==original) {
			System.out.println("Perfect number");
		}else {
			System.out.println("NOT a Perfect number");
		}
		sc.close();
	}
}
