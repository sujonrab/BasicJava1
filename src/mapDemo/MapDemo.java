package mapDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		Map<String,String> map = new Hashtable<>();
		map.put("myName", "Sujon");
		map.put("actor", "Natasha");
		map.put("ceo", "Ari");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
		{
			System.out.println(key + " " +map.get(key));
			
		}
		

	}

}
