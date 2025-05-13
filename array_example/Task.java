package array_example;

public class Task {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		for (int j = 0; j < numbers.length; j++) {
			numbers[j] += 1;
		}
		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(++numbers[i]);
		}

		char[] letters = { 'A', 'B', 'C', 112 };
		for (int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}

	}

}
