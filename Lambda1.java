package java8;

/* A functional interface is an interface containing a single abstract method.  
 * Lambda expression is an expression providing implementation for this single abstract method(SAM).
 * It helps to greatly reduce implementation code for methods. 
 */

@FunctionalInterface
 interface one {
	public void doNothing();
			
}

@ FunctionalInterface
interface two {
	public String doSomething(String name);
	
}

@FunctionalInterface
interface three {
	public int addNumbers(int one,int two);
}

public class Lambda1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Rahul";
		
		// Lambda expression with no parameter.
		one lamb= ()-> {
			System.out.println("You are not doing anything "+name);
		};
		lamb.doNothing();
		
		// Lambda expression with one parameter.
		two lamb2=(name2) -> {
			return "Hello "+name2;
		};
		System.out.println(lamb2.doSomething("Rahul"));
		
		
		three lamb3=(a,b) -> a+b;
		System.out.println(lamb3.addNumbers(9, 4));

	}

}
