
package java8.FunctionalInterfaces;

@FunctionalInterface
interface Sayable {
	void say(String msg);
}

public class FunctionalInterfaceExample implements Sayable {
	@Override
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Sayable sayable = new FunctionalInterfaceExample()::say;
		sayable.say("This is method referecne with predifined interfaceF");

		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("This is the Example of Function Interface");
	}
}
