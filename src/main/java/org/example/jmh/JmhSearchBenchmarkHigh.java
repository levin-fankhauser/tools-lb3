package org.example.jmh;

import org.example.BinarySearch;
import org.example.JumpSearch;
import org.example.LinearSearch;
import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
public class JmhSearchBenchmarkHigh {
	int[] arr = initArr();
	int key = 66;

	@Benchmark
	public int testLinearSearch() {
		return LinearSearch.linearSearch(arr, key);
	}

	@Benchmark
	public int testBinarySearch() {
		return BinarySearch.binarySearch(arr, key, arr.length - 1);
	}

	@Benchmark
	public int testJumpSearch() {
		return JumpSearch.jump_search(arr, arr.length, key);
	}

	private static int[] initArr() {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			numbers.add(i);
		}

		// Setze einen festen Seed für den Zufallsgenerator
		long seed = 12345L; // Der Seed bestimmt die Reihenfolge
		Random random = new Random(seed);

		// Mische die Liste
		Collections.shuffle(numbers, random);

		return numbers.stream().mapToInt(Integer::intValue).toArray();
	}
}
