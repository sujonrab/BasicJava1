package wrapperClass;

public class WrapperDemo {

	public static void main(String[] args) 
	// Primitive -> object
	{
		int x = 30;
		Integer Y = Integer.valueOf(x);
		
		System.out.println("Y = "+Y);
		
		Integer Z = x; // Integer.valueOf(x) // Autoboxing
		
		System.out.println("Z = "+Z);
		
		// Object -> Primitive data type
		
		Double d = new Double(10.25);
		System.out.println("d = "+d);
		
		double e = d; // d.doubleValue()// Unboxing 
		System.out.println("e = "+e);

	}

}
