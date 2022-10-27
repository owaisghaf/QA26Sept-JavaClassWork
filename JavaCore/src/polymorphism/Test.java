package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		Liquid l=new Liquid();
		Milk m=new Milk();
		Tea t=new Tea();
		Mug mg=new Mug();
		Coffee c=new Coffee();
		
		mg.addLiquid(c);
		mg.addLiquid(m);
		mg.addLiquid(t);
		mg.addLiquid(l);
		
	}

}
