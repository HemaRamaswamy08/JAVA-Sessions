package assesmentobject;

import java.util.Scanner;


public class Garage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServiceBooking cust_details1 = new ServiceBooking();
		System.out.println("Customer Name :");
		cust_details1.customerName = sc.nextLine();
		
		System.out.println("Vehicle Type :");
		cust_details1.vehicleType = sc.nextLine();
		
		System.out.println("Problem Description :");
		cust_details1.problemDescription= sc.nextLine();
		
		System.out.println("Appointment date :");
		cust_details1.date = sc.nextLine();
		
		System.out.println("CUSTOMER DETAILS");
		System.out.println("----------------------------------------");
		System.out.println("Customer Name :" + cust_details1.customerName );
		System.out.println("Vehicle Type :"+cust_details1.vehicleType);
		System.out.println("Problem Description :"+cust_details1.problemDescription);
		System.out.println("Appointment date :"+cust_details1.date);
		sc.close();
	}

}
