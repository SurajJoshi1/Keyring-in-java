
public class DeskKey extends Key{

	private String keyColor;
	
	public DeskKey() {
		
		super();
		System.out.println("DeskKey()");
		keyColor = "";
		
	} // DeskKey
	
	public DeskKey(String a, double s, String d) {
		
		super(a, s);
		System.out.println("DeskKey(String a, double s, String d))");
		keyColor = d;
		
	} // DeskKey
	
	public String getColor() {
		
		System.out.println("getColor()");
		return keyColor;
		
	} // getColor()
	
	public void setColor(String a) {
		
		System.out.println("setColor(String a)");
		keyColor = a;
		
	} // setColor()
	
}
