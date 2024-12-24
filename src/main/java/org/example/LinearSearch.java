package org.example;

// Linear Search in Java

public class LinearSearch {
	public static int linearSearch(int array[], int x) {
		int n = array.length;

		// Going through array sequencially
		for (int i = 0; i < n; i++) {
			if (array[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] arr = { 3, 4, 5, 6, 7, 8, 9 };

		int key = 7;

		int result = linearSearch(arr, key);

		if (result == -1)
			System.out.print("Element not found");
		else
			System.out.print("Element found at index: " + result);
	}
}