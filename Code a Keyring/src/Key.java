
public class Key  {

	private String keyName;
	private double keyCode;
	
	public Key() {
		
		System.out.print("Key()");
		keyName = "";
		keyCode = 0;
		
	} // Key
	
	public Key(String a, double s) {
		
		System.out.print("Key(String a, double s)");
		keyName = a;
		keyCode = s;
		
	} // Key
	
	public String getName() {
		
		System.out.println("getName()");
		return keyName;
		
	} // getName
	
	public double getCode() {
		
		System.out.println("getCode()");
		return keyCode;
		
	} // getCode
	
	public void setName(String a) {
		
		System.out.println("setName(String a)");
		keyName = a;
		
	} // setName
	
	public void setCode(double a) {
		
		System.out.println("setCode(double a)");
		keyCode = a;
		
	} // setCode
	
} // class
