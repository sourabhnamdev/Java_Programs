package java8.StringJoinner;

import java.util.StringJoiner;

public class JavaStringJoinerExample {
	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter

		// Adding values to StringJoiner
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

		System.out.println(joinNames);
	}
}
