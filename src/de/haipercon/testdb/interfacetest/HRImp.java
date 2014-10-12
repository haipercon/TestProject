package de.haipercon.testdb.interfacetest;

import de.haipercon.testdb.HR;

public class HRImp implements HR {

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printEmployee(String str) {
		// TODO Auto-generated method stub
		System.out.println("Print HR Emplyee : " + str);
	}

	@Override
	public void printHR(String str) {
		// TODO Auto-generated method stub
		printEmployee("HR Manager");
	}

}
