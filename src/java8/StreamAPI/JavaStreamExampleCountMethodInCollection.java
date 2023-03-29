package java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

class ProductCount {
	int id;
	String name;
	float price;

	public ProductCount(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public String toString() {
		return "[id :- " + id + ", Name :- " + name + ", Price :- " + price + "]";
	}
}

public class JavaStreamExampleCountMethodInCollection {
	public static void main(String[] args) {
		List<ProductCount> productList = new ArrayList<ProductCount>();
		productList.add(new ProductCount(1, "HP Laptop", 30000f));
		productList.add(new ProductCount(2, "Dell Laptop", 25000f));
		productList.add(new ProductCount(3, "Lenevo Laptop", 28000f));
		productList.add(new ProductCount(4, "Apple Laptop", 90000f));
		productList.add(new ProductCount(5, "Sony Laptop", 88000f));

		// count number of products based on the filter
		long count = productList.stream().filter(product -> product.price < 30000).count();
		System.out.println(count);

	}
}