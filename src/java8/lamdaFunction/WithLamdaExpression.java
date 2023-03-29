package java8.lamdaFunction;

interface Test2 {
	public void run();
}

public class WithLamdaExpression {
	public static void main(String args[]) {
		Test2 test2 = () -> {
			System.out.println(" Sourabh Namdev ");
		};

		test2.run();
	}
}
