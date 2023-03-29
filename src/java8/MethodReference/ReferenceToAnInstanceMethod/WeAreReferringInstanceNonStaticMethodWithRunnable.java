package java8.MethodReference.ReferenceToAnInstanceMethod;

public class WeAreReferringInstanceNonStaticMethodWithRunnable {
	public void printnMsg() {
		System.out.println("Hello, this is instance method");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(new WeAreReferringInstanceNonStaticMethodWithRunnable()::printnMsg);
		t2.start();
	}
}
