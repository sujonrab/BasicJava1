package static_keyword;

public class Student {
	
	String name; // instance variable 
	int id;   // instance variable 
	static String universityName="LU"; // static variable or class variable 
	
	Student(String n, int i) // using constructor 
		{
		name = n;
		id = i;
		}
	
	void displayInformation() 
	{
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("University Name :"+universityName);
	}

}
