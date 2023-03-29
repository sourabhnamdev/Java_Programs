package java8.MethodReference.ReferenceToAStaticMethod;

import java.util.function.BiFunction;

class OverlodedAdditonMethod {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class OverrideStaticMethodsByReferringMethods {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder1 = OverlodedAdditonMethod::add;
		BiFunction<Integer, Float, Float> adder2 = OverlodedAdditonMethod::add;
		BiFunction<Float, Float, Float> adder3 = OverlodedAdditonMethod::add;

		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
