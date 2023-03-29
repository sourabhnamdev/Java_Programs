package java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

class ProductForMinAndMax {
	int id;
	String name;
	float price;

	public ProductForMinAndMax(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public String toString() {
		return "[id :- " + id + ", Name :- " + name + ", Price :- " + price + "]";
	}
}

public class JavaStreamExampleFindMaxAndMinProductPrice {
	public static void main(String[] args) {
		List<ProductForMinAndMax> productList = new ArrayList<ProductForMinAndMax>();
		productList.add(new ProductForMinAndMax(1, "HP Laptop", 30000f));
		productList.add(new ProductForMinAndMax(2, "Dell Laptop", 25000f));
		productList.add(new ProductForMinAndMax(3, "Lenevo Laptop", 28000f));
		productList.add(new ProductForMinAndMax(4, "Apple Laptop", 90000f));
		productList.add(new ProductForMinAndMax(5, "Sony Laptop", 88000f));

		// max() method to get max Product price

		ProductForMinAndMax maxPriceOfProduct = productList.stream()
				.max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println("For Maximum Price of Laptop with Max() :- "+maxPriceOfProduct.price);

		// min() method to get min Product price

		ProductForMinAndMax minPriceOfProduct = productList.stream()
				.min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
		System.out.println("For Minimum Price of Laptop with Min() :- "+minPriceOfProduct.price);

	}
}