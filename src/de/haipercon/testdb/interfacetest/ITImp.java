package de.haipercon.testdb.interfacetest;

public class ITImp implements IT {

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printEmployee(String str) {
		// TODO Auto-generated method stub
		System.out.println("Print IT Emplyee : " + str);
	}

	public void printIT() {
		// TODO Auto-generated method stub
		printEmployee("IT Consultant");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITImp itobj = new ITImp();
		itobj.printIT();
	}
}
