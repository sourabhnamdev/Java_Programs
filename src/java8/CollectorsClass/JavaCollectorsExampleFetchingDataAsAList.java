package java8.CollectorsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}
}

public class JavaCollectorsExampleFetchingDataAsAList {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "sourabh", 1000));
		productList.add(new Product(2, "rishabh", 2000));
		productList.add(new Product(3, "himanshu", 3000));
		List<Float> productPriceList = productList.stream().map(x -> x.price).collect(Collectors.toList());
		System.out.println(productPriceList);
	}
}
