package java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllMethodInShortExample {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) {

		// Filter Method Example
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> evenNumbers = numbers.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

		// Map Method Example
		List<String> words = Arrays.asList("hello", "world", "java");
		Stream<Integer> wordLengths = words.stream().map(String::length);
		System.out.println(wordLengths.toList());

		// Sorted Method Example
		List<Integer> sortednumbers = Arrays.asList(5, 1, 3, 4, 2);
		Stream<Integer> sortedNumbers = sortednumbers.stream().sorted();
		System.out.println(sortedNumbers.toList());

		// Reduce Method Example
		List<Integer> reduceNumbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> sum = reduceNumbers.stream().reduce((a, b) -> a + b);
		System.out.println(sum);

		// For Each Method Example
		List<String> forEachMMethodWords = Arrays.asList("\n" + "hello", "world", "java");
		forEachMMethodWords.stream().forEach(System.out::println);

		// Java 9 Feature for TakeWhile and DropWhile method()
		List<Integer> collect = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println("Java 9 " + collect);

		List<Integer> list = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10).dropWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list);

	}
}
