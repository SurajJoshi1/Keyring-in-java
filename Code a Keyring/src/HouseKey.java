
public class HouseKey extends Key {

	private String keyType;
	
	public HouseKey() {
		
		super();
		System.out.println("HouseKey()");
		keyType = "";
		
	} // HouseKey
	
	public HouseKey(String a, double s, String d) {
		
		super(a, s);
		System.out.println("HouseKey()");
		keyType = d;
		
	} // HouseKey
	
	public String getType() {
		
		System.out.println("getType()");
		return keyType;
		
	} // getType()
	
	public void setType(String a) {
		
		System.out.println("setType(String a)");
		keyType = a;
		
	} // setType()
	
} // class
