package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList(4);
		list.add("owais");
		list.add("lara");
		list.add("sharjel");
		list.add("amit");
		list.add("abu");
		System.out.println(list);
		
		System.out.println("---------------------------------------------------------");
		
		Set<String> set = new HashSet(); // not sorted
		set.add("banana");
		set.add("orange");
		set.add("strawberry");
		set.add("apple");
		set.add("banana");
		set.remove("orange");
		System.out.println(set);
		System.out.println(set.contains("strawberry"));
		
		if (set.size() == 0 ){
		    System.out.println("HashSet is empty");
		}
		else {
		    System.out.println("size of this set is " +set.size());
		}
		
		
		
		System.out.println("---------------------------------------------------------");
		
		Set<String> set1 = new TreeSet(); // sorted
		set1.add("banana");
		set1.add("orange");
		set1.add("strawberry");
		set1.add("apple");
		set1.add("banana");
		System.out.println(set1);
	}

}
