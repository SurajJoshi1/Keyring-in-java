
public class Carkey extends Key {

	private String carModel;
	
	public Carkey() {
		
		super();
		System.out.println("Carkey()");
		carModel = "";
		
	} // Carkey
	
	public Carkey(String a, double s, String d) {
		
		super(a, s);
		System.out.println("Carkey(String a, double s, String d))");
		carModel = d;
		
	} // Carkey
	
	public String getModel() {
		
		System.out.println("getModel()");
		return carModel;
		
	} // getModel()
	
	public void setModel(String a) {
		
		System.out.println("setModel(String a)");
		carModel = a;
		
	} // setModel()
	
} // class
