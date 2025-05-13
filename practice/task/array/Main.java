package practice.task.array;

public class Main {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 0, 3, 6, 100, 200, 0, 5 };
		int lengthOfArr = arr.length;
		int countOfZero = 0;
		// know the number of zero
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countOfZero++;
			}
		}

		// create array to store non zero element
		int nonZero[] = new int[lengthOfArr - countOfZero];
		int j = 0;
		// add arra1 elements to nonZeo array only if the value is non zeo
		for (int i = 0; i < lengthOfArr; i++) {
			if (arr[i] != 0) {
				nonZero[j++] = arr[i];
			}
		}
		// to store the result array
		int[] result = new int[lengthOfArr];
		int k = 0;
		// adding the nonZero elements to result array
		for (int i = countOfZero; i < lengthOfArr; i++) {
			result[i] = nonZero[k++];
		}

		for (int i = 0; i < lengthOfArr; i++) {
			System.out.println(result[i]);
		}

	}

}
