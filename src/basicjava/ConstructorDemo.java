package basicjava;

class kalc //  variables 

{
	int num1;
	int num2;
	int result;
	
	public kalc()  // default constructor
	{
	
		num1 = 5;
		num2 = 5;
		System.out.println("in constructor");
	}
	
	public kalc(int n) // parameterize constructor 
	{
		num1 = n;
		num2 = n;
	
	}
	
	public kalc(double d, int n) // parameterize constructor
	{
		num1 = (int)d;
		num2 = n;
	}
	
}


public class ConstructorDemo {

	public static void main(String[] args) {
		
		kalc obj = new kalc(9.5, 8); // Constructor
		
		System.out.println(obj.num1);

	
}

}
