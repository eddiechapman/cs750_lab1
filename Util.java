package Lab1;

public class Util {
	public static void reverse(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
	}


	/**
	 * This method reverses an array differently than the array above.
	 * Notice the return type of this method compared to the one above.
	 * What is another way of reversing the passed in array?
	 * I have started part of it, you must write the rest.
	 */
	public static int[] reversed(int[] arr) {
		int[] rev = new int[arr.length];

		//TODO

		return rev;
	}

	public static int sumOfPositives(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}

		return sum;
	}
}