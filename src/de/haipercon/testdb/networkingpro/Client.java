package de.haipercon.testdb.networkingpro;

import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serverName = "localhost";
		int port = 6060;
		
		try
	      {
	         System.out.println("Connecting to " + serverName  + " on port " + port);
	         
	         Socket client = new Socket(serverName, port);
	         System.out.println("Just connected to "  + client.getRemoteSocketAddress());
	         
	         OutputStream outToServer = client.getOutputStream();
	         DataOutputStream out = new DataOutputStream(outToServer);
	         out.writeUTF("Hello from "  + client.getLocalSocketAddress());
	         
	         InputStream inFromServer = client.getInputStream();
	         DataInputStream in =  new DataInputStream(inFromServer);
	         System.out.println("Server says " + in.readUTF());
	         
	         client.close();
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	}

}
