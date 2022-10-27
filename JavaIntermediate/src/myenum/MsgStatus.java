package myenum;

public enum MsgStatus {
	SENT("Single tick"),
	DELIVERED("Double Tick"),
	READ("Double Blue Tick"),
	DELETED("This Msg Was Deleted");

	String des;
	
	
	private MsgStatus(String m) {
		des = m;
	}
	
	public String getMsg()
	{
		return des;
	}
	
}
