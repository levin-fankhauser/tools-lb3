package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LinearSearch {

	public static int linearSearch(int[] array, int x) {
		int n = array.length;

		for (int i = 0; i < n; i++) {
			if (array[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			numbers.add(i);
		}

		long seed = 12345L;
		Random random = new Random(seed);

		Collections.shuffle(numbers, random);

		// Uncomment the prefered line to run with a big or small array
		int[] arr = numbers.stream().mapToInt(Integer::intValue).toArray();
		// int[] arr = {3, 4, 5, 6, 7, 8, 9};

		int key = 20;

		for (int i = 0; i < 1000; i++) {
			int result = linearSearch(arr, key);

			if (result == -1)
				System.out.print("Not found");
			else
				System.out.print("Element found at position: " + (result + 1));
		}

	}
}