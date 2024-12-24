package org.example;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
public class JmhSearchBenchmark {
	int[] arr = {3, 4, 5, 6, 7, 8, 9};
	int key = 7;

	@Benchmark
	public int testLinearSearch() {
		return LinearSearch.linearSearch(arr, key);
	}

	@Benchmark
	public int testBinarySearch() {
		return new BinarySearch().binarySearch(arr, key, arr.length - 1);
	}

	@Benchmark
	public int testJumpSearch() {
		return JumpSearch.jump_search(arr, arr.length, key);
	}
}
