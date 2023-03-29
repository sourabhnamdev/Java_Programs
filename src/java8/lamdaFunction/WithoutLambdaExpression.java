package java8.lamdaFunction;

interface Test {
	default void defualtMethod() {
		System.out.println("  This  is defualt method ");
	}

	public void run();

	abstract void abstractMethod();
}

public class WithoutLambdaExpression {
	public static void main(String[] args) {
		Test t = new Test() {

			@Override
			public void run() {
				System.out.println(" doing implement of interface");
			}

			@Override
			public void abstractMethod() {
				 System.out.println(" This is abstrect method ");
			}
		};

		t.run();
		t.defualtMethod();
		t.abstractMethod();
	}
}
