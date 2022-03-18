package basicjava;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
	// Primitive -> Object
		
		int a = 30;
		Integer b = Integer.valueOf(a);
		System.out.println("b = "+b);
		
		Integer c = a;  // autoboxing
		System.out.println("c = "+c);

		
	// object -> Primitive
		
		Double d = 10.5;
		Double e = d.doubleValue();
		System.out.println("e = "+e);
		
		Double f = e; // Unboxing
		System.out.println("f = "+f);
		
		
	
		
		
		
		
       
       
       
       
       
       
       	
		

	}

}
