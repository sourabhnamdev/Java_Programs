package java8.DefaultMethods;

interface Sayable4 {
	// default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);

	// static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class StaticMethodsInsideJava8Interface implements Sayable4 {

	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method
		Sayable4.sayLouder("Helloooo..."); // calling static method
	}
}
