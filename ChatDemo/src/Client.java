import java.net.*;
import java.io.*;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
		Socket clientSocket = new Socket("localhost", 8888);
		
		DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
		System.out.println("Message sent");
		dos.writeUTF("Hello There!");
	}

}
