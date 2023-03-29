package java8.MethodReference.ReferenceToAStaticMethod;

public class PredefinedFunctionalInterfaceRunnableToReferStaticMethod {
	public static void thereadsafe() {
		System.out.println("Theread is running");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(PredefinedFunctionalInterfaceRunnableToReferStaticMethod::thereadsafe);
		t1.start();
	}
}
