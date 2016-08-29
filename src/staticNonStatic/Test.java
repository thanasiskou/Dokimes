package staticNonStatic;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args){
		Friend[] friends = new Friend[2];
		friends[0] = new Friend("Mike",123);
		friends[1] = new Friend("Mairy",321);
		System.out.println(friends[1].toString());
		System.out.println(friends[0].toString());
		System.out.println(getName(friends[0]));
		System.out.println("counter = " + Friend.counter);
		Friend.foo();
		ArrayList<Friend> fr = new ArrayList<Friend>();
		fr.add(new Friend("Than",007));
		fr.add(new Friend("Pan",001));
		for(int i = 0; i < fr.size(); i++){
			System.out.println("Friend name: " + fr.get(i).getName() + " and phone: " + fr.get(i).getPhone());
		}
		
	}
	
	public static String getName(Friend friend){
		return friend.getName();
	}
}
