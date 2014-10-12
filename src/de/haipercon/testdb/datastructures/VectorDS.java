package de.haipercon.testdb.datastructures;

import java.util.*;

public class VectorDS {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector(2, 1);
	      System.out.println("Initial size: " + v.size());
	      System.out.println("Initial capacity: " + v.capacity());
	      
	      v.addElement(new Integer(1));
	      v.addElement(new Double(2.2));
	      v.addElement(new Integer(3));
	      System.out.println("Capacity after four additions: " +
	          v.capacity());
		
	      v.add("Merry");
	      v.add("umair");
	      Enumeration e = v.elements();
	      while (e.hasMoreElements()) {
	    	  System.out.print (e.nextElement() + "");
	    	  System.out.println();
	    	  
	      }
	      
	      
	}

}
