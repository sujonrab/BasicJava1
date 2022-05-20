package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// int [] number; // one way of declaring array 
		// number = new int[5]; // one way of creating array
		
		 int [] number = new int [5]; // another way of declaration and creating both.
				number [0] = 10;
				number [1] = 20;
				number [2] = 30;
				number [3] = 40;
				number [4] = 50;
				
				int sum = number[0] + number[1] + number[2] + number[3] + number[4];
				System.out.println("sum = " +sum);
				
				int len = number.length;
				System.out.println("Array size = " +len);
		
		
		
	}

}
