package array_example;

public class ArrayDriver {

	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 25;
		num[1] = 50;
		num[2] = 75;
		num[3] = 100;
		num[4] = 120;
//		num[5]=150; --> Index 5 out of bounds for length 5
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println(" ");
		long[] numbers = new long[3];
		for (int j = 0; j < numbers.length; j++) {
			numbers[j] = j + 1;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
