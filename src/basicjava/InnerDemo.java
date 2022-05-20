package basicjava;

class Outer
{
	int a;
	public void show()
	{
		
	}
	
	class Inner
	{
		public void display()
		{
			System.out.println("in display");
		}
	
	}
}

public class InnerDemo 
{
	
	// variable, method

	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new Inner();
		obj1.display();

	}

}
