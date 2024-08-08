package classNDobject;

public class ClassNdObject {

	private boolean lamp = true;
	 String roomname; 
	
	public ClassNdObject(String room) {
		roomname = room ;
		System.out.println("This is constructor    " + room);
	}
	
	public void lampstatus()
			{
		if(lamp) {
			System.out.println("Light is on    " + roomname);
		}else {
			System.out.println("light is off     " + roomname);
		}
			}
	
	public static void main(String[] args) {
		ClassNdObject k = new ClassNdObject("kitchen");
		k.lampstatus();
		
		k.lamp = false;
		
		k.lampstatus();
	}
	
}
