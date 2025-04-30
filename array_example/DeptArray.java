package array_example;

import java.util.Scanner;

public class DeptArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of department:");
		int size = sc.nextInt();

		Department[] allDepartmentName = new Department[size];
	
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Department:");
			String deptName = sc.next();
			allDepartmentName[i]=new Department(deptName);
		}
		for(int i=0; i<size; i++) {
			System.out.println(allDepartmentName[i]);
		}
		sc.close();

		
	}

}
