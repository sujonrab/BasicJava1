package array;

public class JaggedArray {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		int b[] = {2,4,6,8};
		int c[] = {5,6,7,8};
		
		int d[][] = {
				
				{1,2,3,4},     // Jagged Arrays
				{2,4,8},
				{5,6,7,8,9},
				
		
				};
		
			for(int i=0;i<d.length;i++)
			{
				for(int j=0; j<d[i].length; j++)
				{
					System.out.print(" " + d[i][j]);
				}
				System.out.println();
			}
		

		
		
	}

}
