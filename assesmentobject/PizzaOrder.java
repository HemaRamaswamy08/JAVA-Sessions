package assesmentobject;

public class PizzaOrder {
	String customerName;
	String pizzaSize;
	String toppings;
	float totalPrice;

	public static void main(String[] args) {
		PizzaOrder anjali = new PizzaOrder();
		anjali.customerName = "Anjali";
		anjali.pizzaSize = "Large";
		anjali.toppings= "Mushrum and olives";
		anjali.totalPrice= 499f;
		
		PizzaOrder hema= new PizzaOrder();
		hema.customerName = "Hema";
		hema.pizzaSize = "Small";
		hema.toppings= "Cheese";
		hema.totalPrice= 299f;
	
		System.out.println("----------------------------------------");
		System.out.println("Customer Name :" +anjali.customerName);
		System.out.println("Pizza size :"+anjali.pizzaSize );
		System.out.println("Toppings :"+anjali.toppings);
		System.out.println("Total Price : "+anjali.totalPrice);
		System.out.println("----------------------------------------");
		System.out.println("Customer Name :" +hema.customerName);
		System.out.println("Pizza size :"+hema.pizzaSize );
		System.out.println("Toppings :"+hema.toppings);
		System.out.println("Total Price : "+hema.totalPrice);

	}

}
