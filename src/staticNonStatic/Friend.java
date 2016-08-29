package staticNonStatic;

public class Friend {
	
	private String name;
	private int phone;
	public static int counter = 0;
	
	
	public Friend(String name){this.name = name; counter++;}
	public Friend(int phone){this.phone = phone; counter++;}
	public Friend(String name,int phone){
		this(phone);
		this.name = name;
		counter++;
	}
	
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	public int getPhone(){return phone;}
	public void setPhone(int phone){this.phone = phone;}
	public String toString(){
		return "Friends name: " + name + " and phone: " + phone;
	}
	
	public static void foo(){
		System.out.println("foo");
	}
}
