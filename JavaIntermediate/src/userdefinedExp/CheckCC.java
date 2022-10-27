package userdefinedExp;

public class CheckCC {
	public void check(String ccNo) throws CreditCardExpception
	{
		if(ccNo.length()>16)
			throw new CreditCardExpception("Invalid credit card");
			else
				System.out.println("Payment completed");
	}

}
