package streams;

public class MethodChaining {
	int x=10;
	
	public MethodChaining getObject() { 
		return this;
	}
	
	public MethodChaining addtoX(int y) { 
		this.x=this.x+y;
		return this;
	}
	
	public MethodChaining msg() { 
		return this;
	}

	public MethodChaining show() { 
		System.out.println(this.x);
		return this;
		}
}
