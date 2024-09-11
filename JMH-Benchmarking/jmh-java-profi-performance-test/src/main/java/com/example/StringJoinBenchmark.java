package com.example;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@Fork(2)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class StringJoinBenchmark {
	
	@State(Scope.Benchmark)
	public static class MyBenchmarkState {
		@Param({ "10000", "100000" })
		public int value;
	}

	@Benchmark
	public String stringPlusABC(MyBenchmarkState state, Blackhole blackhole) {
		String result = "";
		for (int i = 0; i < state.value; i++) {
			result += "ABC";
		}

		blackhole.consume(result);
		return result;
	}

	@Benchmark
	public String stringConcatABC(MyBenchmarkState state, Blackhole blackhole) {
		String result = "";
		for (int i = 0; i < state.value; i++) {
			result = result.concat("ABC");
		}

		blackhole.consume(result);
		return result;
	}

	@Benchmark
	public String concatUsingStringBuilder(MyBenchmarkState state, Blackhole blackhole) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < state.value; i++) {
			sb.append("ABC");
		}

		String result = sb.toString();
		blackhole.consume(result);
		return result;
	}
}