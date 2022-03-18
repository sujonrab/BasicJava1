package basicjava;

public class VariableDemo {

	public static void main(String[] args) {
		
		
		long l = 500000000l; // 8 bytes
		int i = 5; // 4 bytes -> 32 bits
		short s = 5; // 2 bytes -> 16 bits -> -32768 to 32767
		byte b = 5; // 1 byte -> b bits -128 to 127
		float f = 5.5f;
		double d = 5.5;
		
		char c = 'A';
		c = 66; // American Standard code for information interchange
		
		
		System.out.println(c);
		
		
		double d1 = 5; // implicit conversation
		int k = (int)5.0; // type casting // explicitly 
		System.out.println(k);

	}

}
