package java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductWithMethodRef {
	int id;
	String name;
	float price;

	public ProductWithMethodRef(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
}

public class MethodReferenceInStream {
	public static void main(String[] args) {

		List<ProductWithMethodRef> productsList = new ArrayList<ProductWithMethodRef>();

		// Adding Products
		productsList.add(new ProductWithMethodRef(1, "HP Laptop", 25000f));
		productsList.add(new ProductWithMethodRef(2, "Dell Laptop", 30000f));
		productsList.add(new ProductWithMethodRef(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductWithMethodRef(4, "Sony Laptop", 28000f));
		productsList.add(new ProductWithMethodRef(5, "Apple Laptop", 90000f));

		List<Float> collect = productsList.stream()
				.filter(P -> P.getPrice() > 28000)
				.map(ProductWithMethodRef::getPrice)
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
