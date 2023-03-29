package java8.FlatMapMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithAJavaStream {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World");
		System.out.println(words);
		List<String> collect = words.stream().flatMap(str -> Arrays.stream(str.split(""))).collect(Collectors.toList());
		System.out.println(collect);
	}
}
