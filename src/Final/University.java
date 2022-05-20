package Final;

public class University 
{
	final String UNIVERSITY_NAME= "LU"; // final variable  
	static final int fees; // static blank final variable
	
	static {
		
		fees = 37000;
	}
	
	void display () {
	
		System.out.println(UNIVERSITY_NAME);
		System.out.println(fees);
	}

}
