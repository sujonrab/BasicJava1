package string_package;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName = "Sujon";
		String lastName = " Rab";
		
		String fullName =  firstName.concat(lastName);
		System.out.println("Full Name = "+fullName);
		
		String upperName = fullName.toUpperCase();
		System.out.println("upperName = "+upperName);
		
		String lowerName = fullName.toLowerCase();
		System.out.println("lowerName = "+lowerName);
		
		boolean b = firstName.startsWith("Su");
		System.out.println("b = "+b);
		
		boolean last = lastName.endsWith("b");
		System.out.println("last = "+last);
		
		

	}

}
