package java8.MethodReference.ReferenceToAStaticMethod;

interface Sayable {
	void say();
}

public class MethodReferenceToAStaticMethod {

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}
	
	

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = MethodReferenceToAStaticMethod::saySomething;
		// Calling interface method
		sayable.say();
	}
}
