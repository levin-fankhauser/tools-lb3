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

		// Setze einen festen Seed für den Zufallsgenerator
		long seed = 12345L; // Der Seed bestimmt die Reihenfolge
		Random random = new Random(seed);

		// Mische die Liste
		Collections.shuffle(numbers, random);

		int[] arr = numbers.stream().mapToInt(Integer::intValue).toArray();
		int key = 20;

		int result = linearSearch(arr, key);

		if (result == -1)
			System.out.print("Not found");
		else
			System.out.print("Element found at position: " + (result + 1));
	}
}