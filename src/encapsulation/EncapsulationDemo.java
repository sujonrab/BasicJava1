package encapsulation;

// Encapsulation- > Binding date with methods

class Student 
{
	private int rollno;
	private String name;
	
	// Getters and Setters
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName("Sujon");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());

	}

}
