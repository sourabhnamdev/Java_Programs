package java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductDetails {
	int id;
	String name;
	float price;

	public ProductDetails(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public String toString() {
		return "[id :- "+id + ", Name :- " + name + ", Price :- " + price+"]";
	}
}

public class JavaStreamExampleFilteringCollectionByUsingStreamMethods {
	public static void main(String[] args) {
		List<ProductCount> productList = new ArrayList<ProductCount>();
		productList.add(new ProductCount(1, "HP Laptop", 30000f));
		productList.add(new ProductCount(2, "Dell Laptop", 25000f));
		productList.add(new ProductCount(3, "Lenevo Laptop", 28000f));
		productList.add(new ProductCount(4, "Apple Laptop", 90000f));
		productList.add(new ProductCount(5, "Sony Laptop", 88000f));

		List<Float> listOfPriceDetails = productList.stream().filter(filter -> filter.price > 30000)
				.map(collectData -> collectData.price).collect(Collectors.toList());

		System.out.println("List of Laptops Price which is  greater then 30000 :- " + "" + listOfPriceDetails);

		List<String> listOfLaptopName = productList.stream().filter(filter -> filter.price > 30000)
				.map(collectData -> collectData.name).collect(Collectors.toList());

		System.out.println("List of Laptops Name which is  greater then 30000 :- " + "" + listOfLaptopName);

		List<ProductCount> listOfLaptopdetails = productList.stream().filter(filter -> filter.price > 30000)
				.collect(Collectors.toList());
		System.out.println("List of Laptops Details Which Price is greter then 30000 :- " + "" + listOfLaptopdetails);

	}
}
