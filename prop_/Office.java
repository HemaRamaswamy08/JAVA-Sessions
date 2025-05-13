package prop_;

import java.util.Scanner;

public class Office {

	public static void main(String[] args) {
		Home hemasHouse = new Home();
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name :");
		String name = sc.nextLine();
		System.out.println("What is your prop name :");
		String propName = sc.nextLine();
		System.out.println("Number of  floors required :");
		int houseFloors = sc.nextInt();
		System.out.println("Number of  rooms required :");
		hemasHouse.bedrooms = sc.nextInt();
		
		
		hemasHouse.customerName = name;
		hemasHouse.houseName = propName;
		hemasHouse.isParkingNecessary = true;
		hemasHouse.isPoolNecessary=false;
		hemasHouse.floors =houseFloors;
		System.out.println("Hema's Requirements ");
		System.out.println("Property name : " + hemasHouse.houseName);
		System.out.println("Number of floors required: " + hemasHouse.floors);
		System.out.println("BedRoom :"+ hemasHouse.bedrooms);
		System.out.println("Is parking required: " + hemasHouse.isParkingNecessary);
		System.out.println("Is pool required : " + hemasHouse.isPoolNecessary);
		sc.close();
	}

}
