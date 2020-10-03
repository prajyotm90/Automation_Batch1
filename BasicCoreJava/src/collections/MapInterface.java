package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		//Map
		
		//Hashmap              //Hashtable
		//Newly added class   //legacy/Synchronized
		//allows null key     //Doesn't allow null key
		
		//Roll no  |  Name
		//  1      | Abhilasha
		//  2      | Prajyot
		//  3      | Amruta
		
		// I want to keep this in key value pair
		// String,Array,ArrayList,HashSet can't store this
		//Solution is Map
		
		Map<Integer, String> stds= new HashMap<>();
		stds.put(1, "Abhilasha");
		stds.put(2, "Prajyot");
		stds.put(3, "Amruta");
		
		System.out.println(stds.get(3));
		
	}

}
