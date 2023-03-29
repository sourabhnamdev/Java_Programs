package java8.MethodReference.ReferenceToAnInstanceMethod;

import java.util.function.BiFunction;

class Arithmetic {
	public int add(int a, int b) {
		return a + b;
	}
}

public class WeAreUsingBiFunctionInterfaceWithPredefinedInterface {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = new Arithmetic()::add;
		Integer result = adder.apply(1, 2);
		System.out.println(result);
	}
}

//Is program me hum BiFunction interface ka upyog kar rahe hain
//jo functional interface hai aur do input parameters ke basis par
//ek output return karta hai. 
//Hum is interface ko ek instance method ke reference ke sath bhi use kar sakte hain.
//
//Is program me Arithmetic class define kiya gaya hai 
//jisme add method hai jo do integers ke sum ko calculate karta hai. 
//Fir hum WeAreUsingBiFunctionInterfaceWithPredefinedInterface class me
//main method me BiFunction interface ka ek instance adder define kar rahe hain
//jisme Arithmetic class ke add method ka reference :: operator ke sath diya gaya hai.
//
//Fir hum adder.apply(1, 2) method ko call kar rahe hain 
//jo 1 aur 2 ko Arithmetic class ke add method ke sath pass karta hai.
//add method in dono integers ko add karta hai aur sum ko return karta hai. 
//Is tarah se, result variable me sum ki value store ho jati hai
//aur hum System.out.println(result)
//statement ke sath sum ko console par print kar sakte hain.
//
//Output:
//3