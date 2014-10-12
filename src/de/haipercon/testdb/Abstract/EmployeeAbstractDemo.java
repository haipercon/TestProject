package de.haipercon.testdb.Abstract;

public class EmployeeAbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary sobj = new Salary ("Merry", "Otto-Suhe-Alle",70,3100);
	      sobj.mailCheck();

		 //Employee eobj = new Salary("Muhamamd","Otto-Röhm-Strsse", 90, 3400);

	      System.out.println("\n Call mailCheck using Employee reference--");
	      //eobj.mailCheck();
	}

}
