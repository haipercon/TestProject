package de.haipercon.testdb.patternmatch;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String to be scanned to find the pattern.
	      String line = "{BED:1234 , AL:777 , BR: 4567 }";
	      String pattern = "([\\w+](\\d+)[\\s+])" + "([\\w+](\\d+)[\\s+])";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      
	      
	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      
	      
	      System.out.println("group count : "+m.groupCount());
	      
	      
	      if (m.find( )) {
	         System.out.println("Found value 0:  " + m.group(0) );
	         System.out.println("Found value 1:  " + m.group(1) );
	      } else {
	         System.out.println("NO MATCH");
	      }
	   }
	
	
}


