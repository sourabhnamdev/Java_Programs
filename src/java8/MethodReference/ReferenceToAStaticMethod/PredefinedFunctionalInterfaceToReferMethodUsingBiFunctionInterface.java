package java8.MethodReference.ReferenceToAStaticMethod;

import java.util.function.BiFunction;

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class PredefinedFunctionalInterfaceToReferMethodUsingBiFunctionInterface {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		Integer result = adder.apply(2, 3);
		System.out.println(result);
	}
}
