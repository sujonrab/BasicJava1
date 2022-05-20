package supermethod;

class A

{
	
	int x = 10;
}

class B extends A

{
	int x = 5;
	
	void displsy () {
		
		System.out.println(super.x);
	}
}

public class SuperMethod {

	public static void main(String[] args) 
	{
	
		B ob = new B();
		ob.displsy();

	}

}
