
public class OfficeKey extends Key {

	private int officeNum;
	
	public OfficeKey() {
		
		super();
		System.out.println("OfficeKey()");
		officeNum = 0;
		
	} // OfficeKey
	
	public OfficeKey(String a, double s, int d) {
		
		super(a, s);
		System.out.println("OfficeKey(String a, double s, int d)");
		officeNum = d;
		
	} // OfficeKey
	
	public int getNum() {
		
		System.out.println("getNum()");
		return officeNum;
		
	} // getNum
	
	public void setNum(int a) {
		
		System.out.println("setNum(int a)");
		officeNum = a;
		
	} // setNum
	
} // class
