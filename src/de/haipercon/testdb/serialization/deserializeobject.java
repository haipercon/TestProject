package de.haipercon.testdb.serialization;

import java.util.*;
import java.io.*;

public class deserializeobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector e = null;
		e = deserialize();
		
		 System.out.println("Size: " + e.size());
		 
		 for (int i = 0; i < e.size() ; i++)
		 {
			 Employee e1 = null;
			 e1 = (Employee) e.elementAt(i);
			 printObj(e1); 
		 }
		 
		 
	}

	
	public static Vector deserialize ( ) {
		Vector e = null;
		try
	      {
	         FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Vector) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return null;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return null;
	      }
		return e;
	}
	
	public static void printObj(Employee e) {
		 System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	}
}
