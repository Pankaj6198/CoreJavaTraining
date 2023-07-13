package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrlist = new ArrayList();
		
		arrlist.add("Ram");
		arrlist.add("Ashok");
		arrlist.add("Rama");
		arrlist.add(10);
		arrlist.add(true);
		
		Emp e1 = new Emp(100,"Parth",1000);
		
		Emp e2 = new Emp(101,"Priya",1500);
		
		arrlist.add(e1);
		arrlist.add(e2);
		

		for(int i1=0; i1<arrlist.size();i1++)
			System.out.println(arrlist.get(i1));
		
		
		arrlist.set(0, "Pankaj");
		
		// Using Iterator
		System.out.println("========================");
		
		Iterator itr = arrlist.iterator();
		
		while(itr.hasNext()) 
		{
			System. out. println(itr.next());
		}
		
		int i= arrlist.indexOf("Ram");
		System.out.println(i);
		
		boolean res = arrlist.contains("Ram");
		System.out.println("Res : "+res); //true
		
		// Remove Ram
		arrlist.remove(0);
		
		// Remove all elements
		arrlist.clear();
		
		System.out.println("Is collection empty: "+arrlist.isEmpty());

		
		for(int i1=0; i1<arrlist.size();i1++)
			System.out.println(arrlist.get(i1));
		
		
	}

}
