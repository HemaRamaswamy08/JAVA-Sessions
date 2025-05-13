package assesmentobject;

public class ServiceBooking {
	String customerName;
	String vehicleType;
	String problemDescription;
	String date;
	
	public static void main(String[] args) {
		ServiceBooking cust_details = new ServiceBooking();
		cust_details.customerName = "Raju";
		cust_details.vehicleType = "Bike";
		cust_details.problemDescription = "won't start";
		cust_details.date = "16-04-2025";
		
		System.out.println("CUSTOMER DETAILS");
		System.out.println("----------------------------------------");
		System.out.println("Customer Name :" + cust_details.customerName );
		System.out.println("Vehicle Type :"+cust_details.vehicleType);
		System.out.println("Problem Description :"+cust_details.problemDescription);
		System.out.println("Appointment date :"+cust_details.date);
	}
}
