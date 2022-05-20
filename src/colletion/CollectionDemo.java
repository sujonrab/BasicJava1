package colletion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>(); //  List is by default is Mutable
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
				
		Collections.sort(values, (i,j)-> i%10>j%10?1:-1); // sorting element
		
		
		for(Integer o : values)
		{
			System.out.println(o);
		}
		
	}

}
