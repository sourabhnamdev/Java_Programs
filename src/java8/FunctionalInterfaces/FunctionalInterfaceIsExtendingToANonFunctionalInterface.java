package java8.FunctionalInterfaces;

interface Doable {
	default void dolt() {
		System.out.println("Do It Now!");
	}
}

interface Sayble3 extends Doable {
	void say(String msg); // abstract method
}

public class FunctionalInterfaceIsExtendingToANonFunctionalInterface implements Sayble3 {

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceIsExtendingToANonFunctionalInterface fi = new FunctionalInterfaceIsExtendingToANonFunctionalInterface();
		fi.say("This is Example Extending non Functional Interface");
		fi.dolt();
	}
}
