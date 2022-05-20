package basicjava;

class calc //  variables 

{
	int num1;
	int num2;
	int result;


	public void perform() //  methods
	{
		result = num1+num2;
	}
}

public class ObjectDemo 

{

	public static void main(String[] args) {
		
		calc obj = new calc(); // knows something and does something
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.perform();
		
		System.out.println("result is : " + obj.result);
		

	}

}
