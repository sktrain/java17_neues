package com.example;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

// Inspired by http://alblue.bandlem.com/2016/04/jmh-stringbuffer-stringbuilder.html
// But using Blackhole
@BenchmarkMode(Mode.AverageTime)
@Fork(2)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class SimpleStringJoinBenchmark 
{
	/*
	private String from = "Michael";
	private String to = "Participants";
	private String subject = "Benchmarking with JMH";

	@Benchmark
	public String stringPlus(Blackhole blackhole) {
		String result = "From: " + from + "\nTo: " + to + "\nSubject: " + subject;
		
		blackhole.consume(result);
		return result;
	}
	
	@Benchmark
	public String stringPlusEqual(Blackhole blackhole) {
		String result = "From: " + from;
		result += "\nTo: " + to;
		result += "\nSubject: " + subject;
	
		blackhole.consume(result);
		return result;
	}

	@Benchmark
	public String stringConcat(Blackhole blackhole) {
		String result = "";
		result = result.concat("From: ");
		result = result.concat(from);
		result = result.concat("\nTo: ");
		result = result.concat(to);
		result = result.concat("\nSubject: ");
		result = result.concat(subject);
	
		blackhole.consume(result);
		return result;
	}
	
	@Benchmark
	public String builderMultipleAppend(Blackhole blackhole) {
		StringBuilder sb = new StringBuilder();
		sb.append("From: " + from);
		sb.append("\nTo: " + to);
		sb.append("\nSubject: " + subject);		
		String result = sb.toString();
		
		blackhole.consume(result);
		return result;
	}
	
	@Benchmark
	public String builderAppendChained(Blackhole blackhole) {
		String result = new StringBuilder().append("From: ").append(from).
				                            append("\nTo: ").append(to).
				                            append("\nSubject: ").append(subject).
				                            toString();
		
		blackhole.consume(result);
		return result;
	}
	*/
}