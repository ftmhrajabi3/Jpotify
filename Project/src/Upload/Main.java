package Upload;


public class Main {

	public static void main(String[] args) {
		ServerReciever server = new ServerReciever("ServerUpload.mp3");
		server.start();
		ClientSender client = new ClientSender("C:\\Users\\Fatemeh Rajabi\\Music\\MissU.mp3");
		client.start();
	}
}
