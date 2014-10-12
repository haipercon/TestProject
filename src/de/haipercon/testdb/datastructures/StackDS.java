package de.haipercon.testdb.datastructures;

import java.util.*;

public class StackDS {
	
	static void showpop(Stack st) {
	      System.out.println("Element :" + st.pop());
	      System.out.println("stack: " + st);
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push (new Integer(1));
		st.push (new Double(1.2));
		st.push (new String("Merry"));
		st.push (new String("umair"));

		System.out.println("stack : " +st);
		System.out.println("peek : " +st.peek());
		System.out.println("serach position: " +st.search("Merry"));

		showpop(st);
		
		try {
			showpop(st);	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("empty stack");
		}
	}
}
