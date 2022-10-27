package methods;

public class Television {
	String brand;
	int price;
	int screenSize;
	
	public void turnOn()
	{
		System.out.println("shows display");
	}
	
	public int switchToChannel()
	{
		return 1;
	}
		
		public double getDiscount()
		{
			return (price*10/100);
	    }
		
		public double getDiscountBalcFriday(int dis)
		{
			return (price*dis/100);
	    }
		
		public double dicountWithCityBank(int dis, int cityDiscount)
	    {
	        System.out.println("");
	        int totalDiscount=dis+cityDiscount;
	        return (price*(totalDiscount)/100);
	        
	    }
	

}
