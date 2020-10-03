package collections;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

public class ListInterface {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Hemant");
		list.add("Prajyot");
		list.add("Vikas");
		list.add("Prajyot");
		System.out.println("This is printing list: " + list);
		for (String newlist : list) {
			System.out.println(newlist);
		}
		// Below is just example for understanfing List --> Object
		List list1 = new ArrayList<>();
		list1.add(10);
		list1.add("Prajyot");
		list1.add(true);
		for (Object l : list1) {
			System.out.println(l);
		}
		List<String> list3 = new Vector<>();
		list3.add("Test");
		list3.add("Vector");
		for (String l3 : list3) {
			System.out.println(l3);
		}
	}
}
//ArrayList implements dynamic array, it allows duplicate data
//It is better in accessing and storing data
//Default size 10--->15


//LinkedList implements doubly LinkedList, it allows duplicate data
//It is better in manipulating

//Vector
//Synchronized  //Legacy class  //Thread safe
//ArrayList(grows by 50%) & Vector grows by 100%
//Default size 10--->20