package com.example;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
// Based on https://www.retit.de/continuous-benchmarking-with-jmh-and-junit-2/
public class SearchBenchmark {

	/*
	@State(Scope.Benchmark)
	public static class SearchState {
		public String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ___abcdefghijklmnopqrstuvwxyz";
	}

	@Benchmark
	public int testIndexOf(SearchState state) {
		return state.text.indexOf("M");
	}

	@Benchmark
	public int testIndexOfChar(SearchState state) {
		return state.text.indexOf('M');
	}

	@Benchmark
	public boolean testContains(SearchState state) {
		return state.text.contains("M");
	}
	*/
}