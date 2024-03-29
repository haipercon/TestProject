package de.haipercon.testdb.Abstract;

public abstract class Employee {
	private String name;
	private String address;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
    public double computePay()
    {
      System.out.println("Inside Employee computePay");
      return 0.0;
    }
    public void mailCheck()
    {
       System.out.println("Mailing a check to " + this.name
        + " " + this.address);
    }
	public Employee(String name, String address, int number) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
}
