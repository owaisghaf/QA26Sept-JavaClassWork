package mapExample;

import java.util.HashMap;
import java.util.Map;

import collection.Product;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> mymap = new HashMap();
		mymap.put(101, "owais");
		mymap.put(102, "Lara");
		mymap.put(103, "abu");
		mymap.put(104, "sharjel");
		mymap.put(105, "fidha");
		mymap.put(105, "fidha"); // will not store duplicate
		for(Map.Entry m:mymap.entrySet()) {
			System.out.println(m.getKey() + " --- " + m.getValue());
		}
		
		Map<Integer, Product> mymap1 = new HashMap();
        Product prod1=new Product("Bluetooth",50,10,"Boat");        
        Product prod2=new Product("TV",1000,5,"Apple");        
        Product prod3=new Product("Camera",500,8,"Sony");        
        Product prod4=new Product("Tripod",70,15,"Digitech");
        Product prod5=new Product("Camera",500,8,"Sony");        
        Product prod6=new Product("Tripod",70,15,"Digitech");
		mymap1.put(1, prod1);
		mymap1.put(2, prod2);
		mymap1.put(3, prod3);
		mymap1.put(4, prod4);
		mymap1.put(5, prod5);
		mymap1.put(6, prod6);
		
		for(Map.Entry m:mymap1.entrySet()) {
			System.out.println(m.getKey() + " --- " + m.getValue());
		}
		
		// String[] names= {"nnn", "mmm", "lll"};
		// for(String x:names)
		// {
		// sysout(x)
		// }

	}

}
