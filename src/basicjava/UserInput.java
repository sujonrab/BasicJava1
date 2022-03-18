package basicjava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float number;
		System.out.print("Please Enter Your Number ");
		number = input.nextFloat();
		
		System.out.println("Number is = "+number);
		
		
		

	}

}
