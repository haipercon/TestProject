package de.haipercon.testdb.serialization;

import java.io.*;
import java.util.*;

public class serializationObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
	      e.name = "Reyan Ali";
	      e.address = "Phokka Kuan, Ambehta Peer";
	      
		Employee e1 = new Employee();
		      e1.name = "Ali";
		      e1.address = "Phokka Kuan, Ambehta Peer";

		      Vector v = new Vector();
		      v.add(e);
		      v.add (e1);
		      
	      serialobject(v);
	       
	}
	
	
	public static void serialobject(Vector e) {
		try
		{
	         FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	}
	
	

}
