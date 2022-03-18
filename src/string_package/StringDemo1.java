package string_package;

public class StringDemo1 {

	public static void main(String[] args) {
		
		
		String s1 = "sujon Rab";
		String s2 = new String ("Sujon Rab");
		
				
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);

		int len = s1.length();	
		System.out.println("Length of s1 = "+len);
		
	
		boolean con = s1.contains("sujon");
		System.out.println(con);
		
		boolean b = s1.isEmpty();
		System.out.println("b = "+b);
		
	}

}
