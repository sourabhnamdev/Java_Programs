package java8.DefaultMethods;

interface I1 {
	default void m1() {
		System.out.println("1st interface");
	}
	default void m2() {
		System.out.println("1 interface");
	}
}

interface I2 {
	default void m1() {
		System.out.println("2nd interface");
	}
}

public class DiamondProblem implements I1, I2 {
	public static void main(String[] args) {
		DiamondProblem obj = new DiamondProblem();
		obj.m1();
	}

	@Override
	public void m1() {
		I1.super.m2();
	}

}
