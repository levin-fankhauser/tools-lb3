package org.example;

public class BinarySearch {
	int binarySearch(int[] array, int x, int high) {
		int low = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (x == array[mid])
				return mid;

			if (x > array[mid])
				low = mid + 1;

			else
				high = mid - 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int[] arr = { 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int key = 7;
		int result = ob.binarySearch(arr, key, n - 1);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at position " + (result + 1));
	}
}