package java8.CollectorsClass;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

class Product3 {
	int id;
	String name;
	int price;

	public Product3(int id, String name, int pr) {
		this.id = id;
		this.name = name;
		this.price = pr;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "id :- " + id + ", name:- " + name + ", price:-  " + price;
	}
}

public class JavaCollectorsExampleUsingCollectorsMethods {
	public static void main(String[] args) {
		List<Product3> productList = new ArrayList<Product3>();
		productList.add(new Product3(1, "sourabh", 1000));
		productList.add(new Product3(2, "rishabh", 2000));
		productList.add(new Product3(3, "himanshu", 3000));
 
//		List<Product3> productList2 = new ArrayList<Product3>();
//		productList.add(new Product3(4, "priyanka", 4000));
//		productList.add(new Product3(5, "khusi", 4000));
//		productList.add(new Product3(6, "manrabh", 1000));

		Double sumPrices = productList.stream().collect(Collectors.summingDouble(x -> x.price));
		System.out.println(" Total Price of Products :- " + sumPrices);

		IntSummaryStatistics statistics = productList.stream().collect(Collectors.summarizingInt(x -> x.price));
		System.out.println(" All Staticstics of Products :- " + statistics);

		Double averageOfProduct = productList.stream().collect(Collectors.averagingInt(x -> x.price));
		System.out.println(" average of Products :- " + averageOfProduct);

		long countingOfProduct = productList.stream().collect(Collectors.counting());
		System.out.println(" Counting Of Products :- " + countingOfProduct);

		Map<Object, List<Product3>> keyWithNameOfProduct = productList.stream()
				.collect(Collectors.groupingBy(Product3::getName));
		System.out.println(" Key With Name of Product :- " + keyWithNameOfProduct);

		Set<Integer> keySet = productList.stream().collect(Collectors.groupingBy(Product3::getId)).keySet();
		System.out.println(" keySet :- " + keySet);

		Set<Entry<Integer, List<Product3>>> entrySet = productList.stream()
				.collect(Collectors.groupingBy(Product3::getId)).entrySet();
		System.out.println(" entrySet :- " + entrySet);

		List<Product3> replaceAnySpecificProduct = productList.stream()
				.collect(Collectors.groupingBy(Product3::getName)).replace("rishabh", productList);
		System.out.println(" replace :- " + replaceAnySpecificProduct);

	}
}
