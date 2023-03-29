package java8.lamdaFunction;

public class JavaLambdaExpressionExampleCreatingThread {
	public static void main(String[] args) {

		// Thread Example with lambda

		Runnable r1 = () -> {
			System.out.println(" Thread 1 is running");
		};

		Thread t1 = new Thread(r1);
		t1.start();
	}
}
