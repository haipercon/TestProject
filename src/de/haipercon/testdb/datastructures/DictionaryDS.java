package de.haipercon.testdb.datastructures;

import java.util.*;

public class DictionaryDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map m1 = new HashMap(); 
	      m1.put("Zara", "8");
	      m1.put("Mahnaz", "31");
	      m1.put("Ayan", "12");
	      m1.put("Daisy", "14");

	      System.out.println("Map Elements : " + m1);
	      System.out.print("\nelement :" + m1.get("Zara"));
	      System.out.print("\n size :" + m1.size());
	      System.out.print("\n values :" + m1.values());
	      System.out.println();
	      
	      Hashtable balance = new Hashtable();
	      Enumeration names;
	      String str;
	      double bal;

	      balance.put("Zara", new Double(3434.34));


	      // Show all balances in hash table.
	      names = balance.keys();
	      while(names.hasMoreElements()) {
	         str = (String) names.nextElement();
	         System.out.println(str + ": " +
	         balance.get(str));
	      }
	      System.out.println();
	      
	      
	      bal = ((Double)balance.get("Zara")).doubleValue();
	      balance.put("Zara", new Double(bal+1000));
	      System.out.println("Zara's new balance: " +
	      balance.get("Zara"));
	      
	      
	      
	      Hashtable ht = new Hashtable(3,1);
	      ht.put("Zara", new Double(3434.34));
	      
	      Hashtable htc = new Hashtable(3,1); 

	      System.out.println("Size htc: " +	htc.size());
	      htc = (Hashtable) ht.clone();
	      System.out.println("Size htc: " +	htc.size());
	      

	}

}
