package org.example;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class JumpSearch {

	public static void main(String[] args) {
		int key, index;

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

		key = 20;
		for (int i = 0; i < 1000; i++) {
			index = jump_search(arr, arr.length, key);
			if (index >= 0)
				System.out.print("Element found at position " + (index + 1));
			else
				System.out.print("Not found");
		}
	}

	public static int jump_search(int[] arr, int n, int key) {

		int i, j, m, k;
		i = 0;
		m = (int) Math.sqrt(n);
		k = m;
		while (arr[m] <= key && m < n) {
			i = m;
			m += k;
			if (m > n - 1)
				return -1;
		}

		for (j = i; j < m; j++) {
			if (arr[j] == key)
				return j;
		}
		return -1;
	}
}