package java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductNew {
	int id;
	String name;
	float price;

	public ProductNew(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "id :- " + id + ", name:- " + name + ", price:-  " + price;
	}
}

public class JavaStreamExampleReduceMethodInCollection {
	public static void main(String[] args) {
		List<ProductNew> productsList = new ArrayList<ProductNew>();
		// Adding Products
		productsList.add(new ProductNew(1, "HP Laptop", 25000f));
		productsList.add(new ProductNew(2, "Dell Laptop", 30000f));
		productsList.add(new ProductNew(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductNew(4, "Sony Laptop", 28000f));
		productsList.add(new ProductNew(5, "Apple Laptop", 90000f));

		Float addintionOfpriceing = productsList.stream().map(product -> product.price).reduce(0.0F, (a, b) -> a + b); // accumulating
																														// price
		System.out.println("[Total Amount Of Laptops with a and b variables:- " + addintionOfpriceing + "]");

		Float maxValue = productsList.stream().map(product -> product.price).reduce(0.0F, Float::max); // accumulating
																										// price
		System.out.println("[Maximun Price Of Laptop :- " + maxValue + "]");

		Float sumOfPrice = productsList.stream().map(product -> product.price).reduce(0.0F, Float::sum); // accumulating
																											// price
		System.out.println("[Total Price Of Laptop with Method Referecne:- " + sumOfPrice + "]");

		// Using Collectors's method to sum the prices.
		double totalPrice3 = productsList.stream().collect(Collectors.summingDouble(product -> product.price));
		System.out.println("[Total Price Of Laptop with Collectors Method :- " + totalPrice3 + "]");
	}
}