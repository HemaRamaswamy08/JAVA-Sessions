package assesments;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num = 2;
		boolean isPrime = true;
		while (num <=100) {
			for (int i = 2; i <= (num / 2); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
				isPrime=true;
			}
			if (isPrime) {
				System.out.println(num);
			}
			num++;
		}

	}

}
