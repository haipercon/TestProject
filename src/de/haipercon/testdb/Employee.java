package de.haipercon.testdb;
import java.util.Date;

public class Employee {
	private int empId;
	private String empName;
	private String dob;
	private double salary;
	
	public Employee(int empId, String empName, String dob, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dob="
				+ dob + ", salary=" + salary + "]";
	}

}
