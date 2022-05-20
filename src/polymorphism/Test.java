package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Person  P = new Person();
		P.display();
		
		P = new Teacher();
		P.display();
		
		P = new Student();
		P.display();
		
		
	

	}

}
