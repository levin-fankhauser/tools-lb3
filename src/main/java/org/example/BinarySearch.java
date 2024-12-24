package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BinarySearch {
	public static int binarySearch(int[] array, int x, int high) {
		Arrays.sort(array);

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
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			numbers.add(i);
		}

		// Setze einen festen Seed für den Zufallsgenerator
		long seed = 12345L; // Der Seed bestimmt die Reihenfolge
		Random random = new Random(seed);

		// Mische die Liste
		Collections.shuffle(numbers, random);

		int[] arr = numbers.stream().mapToInt(Integer::intValue).toArray();

		int n = arr.length;
		int key = 20;
		int result = binarySearch(arr, key, n - 1);
		if (result == -1)
			System.out.println("Not found");
		else
			System.out.println("Element found at position " + (result + 1));
	}
}
