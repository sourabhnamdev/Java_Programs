package java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ProductForListToMap {
	int id;
	String name;
	float price;

	public ProductForListToMap(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExamplConvertListIntoMap {
	public static void main(String[] args) {
		List<ProductForListToMap> productsList = new ArrayList<ProductForListToMap>();

		// Adding Products
		productsList.add(new ProductForListToMap(1, "HP Laptop", 25000f));
		productsList.add(new ProductForListToMap(2, "Dell Laptop", 30000f));
		productsList.add(new ProductForListToMap(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductForListToMap(4, "Sony Laptop", 28000f));
		productsList.add(new ProductForListToMap(5, "Apple Laptop", 90000f));
		Map<String, Float> collectInMap = productsList.stream().collect(Collectors.toMap(p -> p.name, p -> p.price));
		System.out.println("Keys :- \n" + collectInMap.keySet() + "\nValues :- \n" + collectInMap.values());
		
		Map<Integer, String> idAndName = productsList.stream().collect(Collectors.toMap(p-> p.id,p-> p.name));
		System.out.println("\nLaptop id:- \n" + idAndName.keySet() + "\nLaptop Name :- \n" + idAndName.values());
	}

}