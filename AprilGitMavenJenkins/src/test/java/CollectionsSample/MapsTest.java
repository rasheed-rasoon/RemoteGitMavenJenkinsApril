package CollectionsSample;

import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class MapsTest {
	
	@Test
	public static void TreeMapSample(){
		TreeMap<Integer, String> treeMap=new TreeMap<Integer,String>();
		treeMap.put(1623,"Rasheed");
		treeMap.put(1629,"Rahil");
		treeMap.put(1523,"Nadeem");
		treeMap.put(1956,"Dilshad");
		treeMap.put(1623,"Rahim");
		
		for(Map.Entry<Integer,String> entry:treeMap.entrySet())
		{
			
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		
		
		
		
	}

	
}
