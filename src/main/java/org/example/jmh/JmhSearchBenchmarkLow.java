package org.example.jmh;

import org.example.BinarySearch;
import org.example.JumpSearch;
import org.example.LinearSearch;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@Warmup(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@Fork(2)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
public class JmhSearchBenchmarkLow {
	int[] arr = {3, 4, 5, 6, 7, 8, 9};
	int key = 7;

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
}
