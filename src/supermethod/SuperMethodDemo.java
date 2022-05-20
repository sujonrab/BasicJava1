package supermethod;

class X
{
	void display() {
		System.out.println("Inside X Class");
	}
	
}

class Y extends X
{
	void display() {
		
		
		super.display();
		System.out.println("Inside Y Class");
	}
	
}

public class SuperMethodDemo {

	public static void main(String[] args) 
	
	{
		Y ob = new Y();
		ob.display();

	}

}
