package java8.lamdaFunction;

interface Test3 {
	
	public void withoneparameter(String name,int lastname);
}


interface Addition {
	
	public int addvalues(int a, int b);
}


public class WithLamdaExpressionWithParamter {
	public static void main(String args[]) {

		Test3 test3 = (name,lastname) -> {
			System.out.println(" "+name+" "+lastname);
		};
		test3.withoneparameter("Sourabh",101);

		Addition add =(a,b)-> {
			
			return a+b;
 		};
 		
 		System.out.println(" "+add.addvalues(1, 2));
	}
}

