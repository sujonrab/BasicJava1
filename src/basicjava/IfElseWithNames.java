package basicjava;

import java.util.Scanner;

public class IfElseWithNames {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		 
		String userName = input.nextLine();
		
		System.out.println("The User Name is: " +userName);
		
		if(userName == "Sujon Rab") {
			
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
			

	}

}
