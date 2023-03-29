package java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class ProductForListToSet {
	int id;
	String name;
	float price;

	public ProductForListToSet(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExamplConvertListIntoSet {
	public static void main(String[] args) {
		List<ProductForListToSet> productsList = new ArrayList<ProductForListToSet>();

		// Adding Products
		productsList.add(new ProductForListToSet(1, "HP Laptop", 25000f));
		productsList.add(new ProductForListToSet(2, "Dell Laptop", 30000f));
		productsList.add(new ProductForListToSet(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductForListToSet(4, "Sony Laptop", 28000f));
		productsList.add(new ProductForListToSet(5, "Apple Laptop", 90000f));

		// Converting product List into Set
		Set<Float> productPriceList = productsList.stream().filter(product -> product.price < 30000)
				.map(product -> product.price).collect(Collectors.toSet()); // filter product on the base of price
																			// collect it as Set(remove duplicate
																			// elements)
		System.out.println(productPriceList);
	}
}