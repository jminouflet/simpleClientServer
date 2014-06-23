package clientServer;

import java.net.DatagramSocket;
import java.net.ServerSocket;

public class ConnectionFactory {

	public enum Protocol{
		UDP,
		TCP
	}

	public static Object getConnection(String adresse, Protocol protocol) throws Exception{
		if(protocol == Protocol.TCP){
			// cr�er un serveur TCP
			ServerSocket listennerSocket = SingletonTCPConnection.getListennerSocket();
			return listennerSocket;
		} else {
			// cr�er un serveur UDP
			DatagramSocket serverSocket = SingletonUDPConnection.getListennerSocket();
			return serverSocket;
		}
	}

	public void send(String message) throws Exception{

	}

	public  String receive() throws Exception{

	}
}