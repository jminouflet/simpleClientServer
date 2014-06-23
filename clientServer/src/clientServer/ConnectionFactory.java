package clientServer;

import java.net.DatagramSocket;
import java.net.ServerSocket;

public class ConnectionFactory {

	public enum Protocol{
		UDP,
		TCP
	}

	public Object getConnection(String adresse, Protocol protocol) throws Exception{
		if(protocol == Protocol.TCP){
			// cr�er un serveur TCP
			
			ServerSocket listennerSocket = SingletonTCPConnection.getListennerSocket();
			return listennerSocket;
			} else {
			// cr�er un serveur UDP
				DatagramSocket serverSocket = SingletonUDPConnection.getListennerSocket(); //Ouvrir le port 6789
			return serverSocket;
		}
	}

}