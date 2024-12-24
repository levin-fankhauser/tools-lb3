package org.example;

import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class JumpSearch {
	public static void main(String args[]) {
		int i, n, key, index;
		int[] arr = { 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Array elements are: ");
		for(int j = 0; j<arr.length; j++){
			System.out.print(arr[j] + " ");
		}
		n = 12;
		key = 7;
		System.out.println("\nThe element to be searched: "+ key);
		index = jump_search(arr, n, key);
		if(index >= 0)
			System.out.print("The element is found at position " + (index+1));
		else
			System.out.print("Unsuccessful Search");
	}
	static int jump_search(int arr[], int n, int key) {
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