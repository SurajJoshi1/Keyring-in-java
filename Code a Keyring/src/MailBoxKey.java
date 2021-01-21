
public class MailBoxKey extends Key{

	private int boxNum;
	
	public MailBoxKey() {
		
		super();
		System.out.println("MailBoxKey()");
		boxNum = 0;
		
	} // MailBoxKey
	
	public MailBoxKey(String a, double s, int d) {
		
		super(a, s);
		System.out.println("MailBoxKey(String a, double s, int d)");
		boxNum = d;
		
	} // MailBoxKey
	
	public int getNum() {
		
		System.out.println("getNum()");
		return boxNum;
		
	} // getNum
	
	public void setNum(int a) {
		
		System.out.println("setNum(int a)");
		boxNum = a;
		
	} // setNum
	
} // class
