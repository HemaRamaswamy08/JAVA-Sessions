package methodOverRiding;

public class CofeeShop {
	public void orderCofee() {
		System.out.println("Ordered Filter Cofee");
	}
	public void orderCofee(int sugarCount) {
		System.out.println("Ordered Filter Cofee with "+sugarCount+"spoons");
	}
	public void orderCofee(String cofeeType) {
		System.out.println("Ordered "+cofeeType);
	}
	public void orderCofee(String cofeeType, int sugarCount) {
		System.out.println("Ordered " + cofeeType+" with "+sugarCount);
	}
}
