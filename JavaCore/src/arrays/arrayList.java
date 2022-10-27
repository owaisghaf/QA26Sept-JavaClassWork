package arrays;

import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {
		int[] x=new int[5];
		ArrayList list=new ArrayList();
		list.add("owais");
		list.add("laraib");
		list.add(3454);
		list.add(true);
		list.add("y");
		System.out.println(list);
		
		ArrayList<String> names=new ArrayList();
		names.add("ozwoz");
		names.add("lababe");
		names.add("ibi");
		System.out.println(names);
		System.out.println(names.size());
	}

}
