package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		Set<Integer> ids = new HashSet<>();

		ids.add(10);
		ids.add(20);
		ids.add(30);
		ids.add(10);
		ids.add(40);

		for (int id : ids) {
			System.out.println(id);
		}
		
		System.out.println("**************");

		Set<String> names = new HashSet<>();

		names.add("Prajyot");
		names.add("Abhilasha");
		names.add("Vikas");
		System.out.println("Kishan");

		for (String s : names) {
			System.out.println(s);
		}

		System.out.println("**************");
		
		names = new TreeSet<>();
		names.add("Prajyot");
		names.add("Abhilasha");
		names.add("Vikas");
		System.out.println("Kishan");

		for (String ts : names) {
			System.out.println(ts);
		}
		
		System.out.println("**************");

		names = new LinkedHashSet<>();
		names.add("Prajyot");
		names.add("Abhilasha");
		names.add("Vikas");
		System.out.println("Kishan");

		for (String lhs : names) {
			System.out.println(lhs);
		}
	}

}
