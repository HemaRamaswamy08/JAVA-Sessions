package methodOverRiding;

public class Billing {

	public static void main(String[] args) {
		CofeeShop cofee = new CofeeShop();
		cofee.orderCofee();
		cofee.orderCofee("Capichino");
		cofee.orderCofee(2);
		cofee.orderCofee("Americano",1);

	}

}
