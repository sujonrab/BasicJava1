package inheritance;

public class Teacher extends Person {
	
	// name,age, displayinformation1()
	
	String qualification;
	
	void displayinformation2() {
		
		displayinformation1();
		System.out.println("Qualification : " +qualification);
	}
	
	

}
