package java8.FunctionalInterfaces;

@FunctionalInterface
interface Sayable1 {
	void say(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	boolean equals(Object obj);
}

public class FunctionalInterfaceCanHaveMethodsOfObjectClass implements Sayable1 {

	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceCanHaveMethodsOfObjectClass fi = new FunctionalInterfaceCanHaveMethodsOfObjectClass();
		fi.say(" Function Interface ");
	}

}
