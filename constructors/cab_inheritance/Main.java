package cab_inheritance;

import java.util.Scanner;

public class Main {
	private static Go go;
	private static Premium premium;
	private static PremiumXL premiumXL;
	static {
		go = new Go();
		premium = new Premium();
		premiumXL = new PremiumXL();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("Which cab do you prefer");
			System.out.println("1.GO");
			go.features();
			System.out.println("2.Premium");
			premium.features();
			System.out.println("3.PremiumXL");
			premiumXL.features();

			System.out.println("Choose you cab:");
			choice = sc.nextInt();

		} while (choice < 0 || choice > 4);

		switch (choice) {
		case 1: {
			System.out.println("GO");
			go.book();
			break;
		}
		case 2: {
			System.out.println("Premium");
			premium.book();
			break;
		}
		case 3: {
			System.out.println("PremiumXL");
			premiumXL.book();
			break;
		}
		case 4: {
			go.cancel();
		}

		}
		sc.close();

	}
}
