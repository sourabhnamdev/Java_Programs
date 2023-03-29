package java8.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateFunction {
	public static void main(String[] args) {
		Predicate<String> fun = s -> s.length() >= 5;
		System.out.print(fun.test("s"));
		Predicate<String> fun2 = s-> s.length()%2==0;
		System.out.println(fun.negate().test("soursb"));
		
	}
}
