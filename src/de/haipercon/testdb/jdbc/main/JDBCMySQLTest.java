package de.haipercon.testdb.jdbc.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import de.haipercon.testdb.jdbc.db.JDBCMySQLConnection;
import de.haipercon.testdb.Employee;

public class JDBCMySQLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JDBCMySQLTest demo = new JDBCMySQLTest();

		try {
			demo.insertEmployee(new Employee(1,"muhammad", "20.05.1987", 3100));	
			demo.insertEmployee(new Employee(4,"merry", "20.05.1987", 3100));	
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int employeeId, search;
		try {
			System.out.println("Select Search creteria, (1 -> Search by employee_id, 2 -> serch all employees) :");
			search = Integer.parseInt(br.readLine());
			
			if (search == 1){
				System.out.println("Enter the EmployeeID:");
				employeeId = Integer.parseInt(br.readLine());
				Employee employee = demo.getEmployee(employeeId);
				if (employee== null) {
					System.out.println("No record exit in database with employee id : " + employeeId);
				}
				else {
					System.out.println(employee);	
				}
			}
			else if (search == 2){
				demo.allEmployees();				
			}
			else {
				System.out.println("Search certiteria doesn't machted");	
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	
	public Employee getEmployee(int employeeId)  {		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
		
		Employee employee = null;
		String query = "SELECT * FROM employee WHERE emp_id=" + employeeId;
		try {			
			connection = JDBCMySQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			
			if (rs.next()) {
				employee = new Employee();
				employee.setEmpId(rs.getInt("emp_id"));
				employee.setEmpName(rs.getString("emp_name"));
				employee.setDob(rs.getString("dob"));
				employee.setSalary(rs.getDouble("salary"));
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return employee;
	}
	
	
	public boolean allEmployees()  {		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
		
		String query = "SELECT * FROM employee" ;
		try {			
			connection = JDBCMySQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			Employee employee = new Employee();
			
			while (rs.next()) {
				employee.setEmpId(rs.getInt("emp_id"));
				employee.setEmpName(rs.getString("emp_name"));
				employee.setDob(rs.getString("dob"));
				employee.setSalary(rs.getDouble("salary"));
				System.out.println(employee);	
			}			
			System.out.println("Print all records");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	
	public Boolean isEmployeeExist(int employeeId)  {		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
	    String query = "SELECT * FROM employee WHERE emp_id=" + employeeId;
		try {			
			connection = JDBCMySQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if (rs.next() && rs.getInt("emp_id") == employeeId) {
				System.out.println("Employee Id : " +   employeeId  + " already exist in database");
				return true;
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	
	public void insertEmployee(Employee employee) {
		
		Connection connection = null;
		Statement statement = null; 
		String query = "insert into employee (emp_id, emp_name, dob, salary ) values (?, ?, ?, ?)";
		
		try {
			if (!isEmployeeExist(employee.getEmpId())) {
				connection = JDBCMySQLConnection.getConnection();
				statement = connection.createStatement();
				PreparedStatement preparedStmt = (PreparedStatement) connection.prepareStatement(query);
			    preparedStmt.setInt    (1, employee.getEmpId());
			    preparedStmt.setString (2, employee.getEmpName());
			    preparedStmt.setString   (3, employee.getDob());
			    preparedStmt.setDouble (4, employee.getSalary() );
			    preparedStmt.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	} 
}
