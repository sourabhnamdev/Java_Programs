package java8.CollectorsClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class ProductTemp {
	int id;
	String name;
	float price;

	public ProductTemp(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public String toString() {
		return id + " " + name + " " + price;
	}
}

public class JavaCollectorsExampleConvertingDataAsASet {
	public static void main(String[] args) {

		List<ProductTemp> productList = new ArrayList<ProductTemp>();
		productList.add(new ProductTemp(1, "sourabh", 1000));
		productList.add(new ProductTemp(2, "rishabh", 2000));
		productList.add(new ProductTemp(3, "himanshu", 3000));
		productList.add(new ProductTemp(3, "himanshu", 3000));

		
		Set<ProductTemp> collect = productList.stream().collect(Collectors.toSet());
		System.out.println(collect);

		Set<Float> productPriceList = productList.stream().map(x -> x.price).collect(Collectors.toSet());
		System.out.println(productPriceList);
	}
}