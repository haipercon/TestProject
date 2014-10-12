package de.haipercon.testdb.networkingpro;

import java.net.*;
import java.io.*;

public class Server extends Thread {

	private ServerSocket serverSocket;
	
	
	public Server(int port) throws IOException {
		serverSocket = new ServerSocket (port);
		//serverSocket.setSoTimeout(50000);
	}
	
	 public void run()
	   {
	      while(true)
	      {
	         try
	         {
	            System.out.println("Waiting for client on port " +  serverSocket.getLocalPort() + "...");
	            Socket server = serverSocket.accept();
	            System.out.println("Just connected to " + server.getRemoteSocketAddress());
	            
	            DataInputStream in =  new DataInputStream(server.getInputStream());
	            System.out.println(in.readUTF());
	            
	            DataOutputStream out = new DataOutputStream(server.getOutputStream());
	            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");
	            server.close();
	         }
	         catch(SocketTimeoutException s)
	         {
	            System.out.println("Socket timed out!");
	            break;
	         }catch(IOException e)
	         {
	            e.printStackTrace();
	            break;
	         }
	      }
	   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 6060;//Integer.parseInt(6060);
	      try
	      {
	         Thread t = new Server(port);
	         t.start();
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
	}
}
