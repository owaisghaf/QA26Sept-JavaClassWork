package userdefinedExp;

public class ElectionDay {
	public static void main(String[] args) {
		Election obj=new Election();
		try {
			obj.checkEligibility(12);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			
		}
		CheckCC obj1=new CheckCC();
		try {
			obj1.check("123456789234567889999");
		} catch (CreditCardExpception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
