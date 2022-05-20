package basicjava;

class salc //  variables 

{
	int num1;
	int num2;
	int result;
	
	public salc(int num1, int num2)  
	{
	
		this.num1 = num1;// current object or instance 
		this.num2 = num2;
		
	}
		
}



public class ThisKeyWordDemo {

	public static void main(String[] args) 
	{
		
		kalc obj = new kalc(4,5); // Constructor
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
		

	}

}
