package distanceconverter;

public class Test {
	public static void main(String[] args){
		LonLat ll = new LonLat();
		System.out.println(ll.distance(32.9697, -96.80322, 29.46786, -98.53506, 'M') + " Miles");
	    System.out.println(ll.distance(32.9697, -96.80322, 29.46786, -98.53506, 'K') + " Kilometers");
	    System.out.println(ll.distance(32.9697, -96.80322, 29.46786, -98.53506, 'N') + " Nautical Miles");
	}

}
