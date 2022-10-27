package methods;

public class TestTV {
	
	public static void main(String[] args) {
		Television tele=new Television();
		tele.turnOn();
		tele.price=1200;
		tele.brand="samsung";
		tele.screenSize=55;
		int x = tele.switchToChannel(); // stores value of method in local variable
		System.out.println(x);
		System.out.println(tele.switchToChannel()); // prints value in console
	    double discount=tele.getDiscount();
	    System.out.println(discount);
	
	    // takes method and inputs value to return a value
	    double discountonBF=tele.getDiscountBalcFriday(30);
	    System.out.println(discountonBF);
	    
	    double discountonEND=tele.getDiscountBalcFriday(50);
	    System.out.println(discountonEND);
	    
	    double totalDiscount=tele.dicountWithCityBank(30, 25);
        System.out.println(totalDiscount);
	}

	
}
