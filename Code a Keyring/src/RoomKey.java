
public class RoomKey extends Key{

	private int roomNum;
	
	public RoomKey() {
		
		super();
		System.out.println("RoomKey()");
		roomNum = 0;
		
	} // RoomKey
	
	public RoomKey(String a, double s, int d) {
		
		super(a, s);
		System.out.println("RoomKey(String a, double s, int d)");
		roomNum = d;
		
	} // RoomKey
	
	public int getNum() {
		
		System.out.println("getNum()");
		return roomNum;
		
	} // getNum
	
	public void setNum(int a) {
		
		System.out.println("setNum(int a)");
		roomNum = a;
		
	} // setNum
	
}
