package basicjava;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter any integer : ");
		
	    num = input.nextInt();
	    
	    if(num>0) {
	    	System.out.println("True");
	    }
	    else if(num<0) {
	    	System.out.println("False");
	    	
	    }
	    
	    else {
	    	System.out.println("Equal to Zero");
	    }

	}

}
