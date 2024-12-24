package org.example;

import java.lang.Math;
public class JumpSearch {
	public static void main(String[] args) {
		int n, key, index;
		int[] arr = { 3, 4, 5, 6, 7, 8, 9 };
		n = 12;
		key = 7;
		index = jump_search(arr, n, key);
		if(index >= 0)
			System.out.print("Element found at position " + (index+1));
		else
			System.out.print("Not found");
	}
	static int jump_search(int[] arr, int n, int key) {
		int i, j, m, k;
		i = 0;
		m = (int)Math.sqrt(n);
		k = m;
		while(arr[m] <= key && m < n) {
			i = m;
			m += k;
			if(m > n - 1)
				return -1;
		}

		// linear search on the block
		for(j = i; j<m; j++) {
			if(arr[j] == key)
				return j;
		}
		return -1;
	}
}