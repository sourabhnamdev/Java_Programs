package java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "id :- " + id + ", name:- " + name + ", price:-  " + price;
	}
}

public class JavaStreamExampleFilteringAndIteratingCollection {
	public static void main(String[] args) {
		List<ProductWithMethodRef> productsList = new ArrayList<ProductWithMethodRef>();
		// Adding Products
		productsList.add(new ProductWithMethodRef(1, "HP Laptop", 25000f));
		productsList.add(new ProductWithMethodRef(2, "Dell Laptop", 30000f));
		productsList.add(new ProductWithMethodRef(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductWithMethodRef(4, "Sony Laptop", 28000f));
		productsList.add(new ProductWithMethodRef(5, "Apple Laptop", 90000f));
		// This is more compact approach for filtering data
		productsList.stream().filter(product -> product.price == 30000)
				.forEach(product -> System.out.println(product.name));
	}
}