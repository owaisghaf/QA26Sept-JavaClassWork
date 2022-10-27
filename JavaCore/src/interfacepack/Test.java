package interfacepack;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		Person p=new Employee();
		p.doSomething();
		Artist a=new Employee();
		a.doArt();
		Player p1=new Employee();
		p1.doPlay();
		DoAble d=new Employee();
		d.do1();
		
		Employee ee=new Employee();
		Student ss=new Student();
		Child cc=new Child();
		
		ArrayList<Player> list=new ArrayList();
		list.add(ee);
		list.add(cc);
		list.add(ss);

}
}