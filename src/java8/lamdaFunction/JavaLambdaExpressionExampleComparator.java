package java8.lamdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String toString() {
		return "Employee List :- (id =" + id + " , name= " + name + " , salary = " + salary + ")";
	}

}

public class JavaLambdaExpressionExampleComparator extends Employee {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "Sourabh", 10000));
		emp.add(new Employee(2, "Rishabh", 20000));
		emp.add(new Employee(3, "Mayank", 30000));
		emp.add(new Employee(4, "Amir", 40000));

		Collections.sort(emp, (t1, t2) -> {
			return t1.name.compareTo(t2.name);
		});

		Stream<Employee> filter = emp.stream().filter(t -> t.salary > 20000);
		filter.forEach(t -> System.out.println("Filter For Salary:- "+t.name + t.salary));

		for (Employee employee : emp) {
			System.out.println(employee);
		}
	}
}
