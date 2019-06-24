package Download;

public class Main {
	public static void main(String[] args) {
		ServerSender server = new ServerSender("C:\\Users\\Fatemeh Rajabi\\Music\\MissU.mp3");
		server.start();
		new ClientReciever("Music.mp3").start();
		return;
	}

}
