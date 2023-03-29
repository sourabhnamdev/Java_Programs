package java8.lamdaFunction;

import java.util.Arrays;
import java.util.List;

public class WithLamdaExpressionForEachLoop {
	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("ankit", "mayank", "sourabh", "rishabh", "manasvi");
        stringList.forEach(
        		(t) -> System.out.println(t)
        		);
	}
}
