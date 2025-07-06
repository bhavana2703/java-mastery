package com.java.streamapi.collectorsClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "ten", "twenty");

		///1. tolist, toset, tomap
		List<String> collectList = list.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
		System.out.println(collectList);

		Set<String> collectSet = list.stream().filter(s -> s.length() > 4).collect(Collectors.toSet());
		System.out.println(collectSet);

		Map<String, Integer> collectMap = list.stream().filter(s -> s.length() > 4)
				.collect(Collectors.toMap(e -> e, String::length));// s->s.length
		System.out.println(collectMap);

		// Map<Integer, String> collectMap1 =
		// list.stream().filter(s->s.length()>4).collect(Collectors.toMap(s->s.length(),
		// e->e));//(attempted merging values three and seven) we will get get due key
		// issues
		Map<Integer, String> collectMap1 = list.stream().collect(
				Collectors.toMap((s -> s.length()), e -> e, (oldValue, newValue) -> oldValue + " , " + newValue));
		System.out.println(collectMap1);

		// work with collection() method
		TreeSet<String> collect = list.stream().collect(Collectors.toCollection(() -> new TreeSet<>()));
		System.out.println(collect);

		long count = collect.stream().count();
		System.out.println(count);

		///2.joining()

		String join = list.stream().collect(Collectors.joining());
		System.out.println(join);

		String join1 = list.stream().collect(Collectors.joining("_"));
		System.out.println(join1);

		String join2 = list.stream().collect(Collectors.joining(",", " { ", " } "));
		System.out.println(join2);

		///3. partitioningBy()
		// (separating based on the condithion )

		Map<Boolean, List<String>> part1 = list.stream().collect(Collectors.partitioningBy(s -> s.length() > 3));
		System.out.println(part1);

		Map<Boolean, Long> part2 = list.stream()
				.collect(Collectors.partitioningBy(s -> s.length() > 3, Collectors.counting()));
		System.out.println(part2);

		///4. groupingby()

		Map<Integer, List<String>> group = list.stream().collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(group);

		Map<Integer, String> group1 = list.stream()
				.collect(Collectors.groupingBy(s -> s.length(), Collectors.joining("=>")));
		System.out.println(group1);

		Map<Integer, List<String>> group2 = list.stream().collect(
				Collectors.groupingBy(s -> s.length(), Collectors.mapping(s -> s.toUpperCase(), Collectors.toList())));
		System.out.println(group2);
		
		
		//5. summarizing (provide statisticaly )
		
		//primitve datatype -->wapper datatype  "boxed" method is used
		
		int[] arr= { 1,2,3,4,5,6};
		
		//int to Integer
		
//		Integer boxedArr[] = new Integer[arr.length];
//		for(int i: arr) {
//			boxedArr[i]=Integer.valueOf(arr[i]);
//		}
		
		//IntSummaryStatistics sum = Arrays.stream(boxedArr).collect(Collectors.summarizingInt(no ->no));
		
		IntSummaryStatistics sum = Arrays.stream(arr).boxed().collect(Collectors.summarizingInt(no->no));
		System.out.println("Sum : " +sum.getSum());
		System.out.println("Min : " +sum.getMin());
		System.out.println("Max : " +sum.getMax());
		System.out.println("Count : " +sum.getCount());
		System.out.println("Average : " +sum.getAverage());
		
		IntSummaryStatistics sum3 = Arrays.stream(arr).boxed().collect(Collectors.summarizingInt(no->no));
		System.out.println(sum3);
		
		//6. minby maxby
		
		Optional<Integer> min = Arrays.stream(arr).boxed().collect(Collectors.minBy(Integer::compareTo));
		min.ifPresent(System.out::println);
		
		Optional<Integer> max = Arrays.stream(arr).boxed().collect(Collectors.maxBy(Comparator.comparingInt(no->no)));
		max.ifPresent(System.out::println);
		
		Integer sum2 = Arrays.stream(arr).boxed().collect(Collectors.summingInt(no->no));
		System.out.println(sum2);
		
		

	}

}
