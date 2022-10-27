package streams;

public class TestMethodChaining {
	public static void main(String[] args) {
		MethodChaining obj = new MethodChaining();
		//obj.getObject();
		//obj.addtoX(10);
		//obj.msg();
		//obj.show();
		
		new MethodChaining().getObject().addtoX(20).msg().show();
		
	}

}
