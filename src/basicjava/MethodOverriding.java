package basicjava;

class A // Super Class
{
void display() {
		
		System.out.println("in A");
	}
	
}

class B extends A  // Sub Class

{
	
void display() {
	
		super.display();
		
		System.out.println("in B");
	}
}
	
	

public class MethodOverriding {

	public static void main(String[] args) 
	
	{
	B obj1 = new B();	
	obj1.display();

	}

}
