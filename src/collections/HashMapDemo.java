package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, String> hashmap = new HashMap<>();
		
		// add element
		
		hashmap.put('P', "Pankaj");
		hashmap.put('R', "Ram");
		hashmap.put('D', "Depti");
		
		// To display
		System.out.println(hashmap);
		
	    Object[] keys=hashmap.keySet().toArray();
		
		for(int i=0;i<keys.length;i++)
			System.out.println(keys[i]);
		
		
		// To get val
		System.out.println(hashmap.get('P'));
		
		// To remove obj
		hashmap.remove('D');
		
		hashmap.clear();
		
		System.out.println("Is empty: "+hashmap.isEmpty());
		
		
	}

}
