package java8.StreamAPI;

import java.util.stream.Stream;

public class JavaStreamIteratingExampleOfTables {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("------------Tables---------------");
		while (i <= 10) {
			
			System.out.println("\n"
					+ "Table of "+""+(i)+"\n");
			int m = i;
			Stream.iterate(i, element -> element + 1).filter(element -> element % m == 0).limit(10)
					.forEach(System.out::println);
		    i++;
			
		}

		
	}
}
