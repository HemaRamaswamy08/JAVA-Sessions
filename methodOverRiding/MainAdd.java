package methodOverRiding;

import java.util.Scanner;

public class MainAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddMethod add = new AddMethod();

		int result;
		int count=0;
		while(count>5 || count <=0) {
			System.out.println("Enter a count of numbers:");
			count = sc.nextInt();
			if(count>5 || count<=0) {
				System.out.println("wrong input");
				System.out.println("Please enter a number between 1 to 5");
			}
			
		}
		switch(count) {
		case 1:{
			System.out.println("Enter numbers");
			int a= sc.nextInt();
			result = add.add(a);
			System.out.println("Addition of one number "+result);
			break;
		}
		case 2:{
			System.out.println("Enter numbers");
			int a= sc.nextInt();
			int b= sc.nextInt();
			result = add.add(a,b);
			System.out.println("Addition of two number "+result);
			break;
		}
		case 3:{
			System.out.println("Enter numbers");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c=sc.nextInt();
			result = add.add(a,b,c);
			System.out.println("Addition of three number "+result);
			break;
		}
		case 4:{
			System.out.println("Enter numbers");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			result = add.add(a,b,c,d);
			System.out.println("Addition of four number "+result);
			break;
		}
		case 5:{
			System.out.println("Enter numbers");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			result = add.add(a,b,c,d,e);
			System.out.println("Addition of five number "+result);
			break;
		}
			
		}
		sc.close();
		
		

		
	}

}
