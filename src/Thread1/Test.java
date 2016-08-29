package Thread1;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		PingPong ping = new PingPong("Ping",30);
		PingPong pong = new PingPong("Pong",60);
		ping.start();
		pong.start();
		for(int i = 0; i < 400 ; i++){
			;
			System.out.print(i + " ");
		}
		ping.stop();
		pong.stop();
	}

}
