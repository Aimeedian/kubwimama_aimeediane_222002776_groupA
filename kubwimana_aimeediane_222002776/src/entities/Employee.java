package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
	private int employee_code;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	private String address;
	private String status;
	public Employee() {}
	public Employee(int employee_code, String firstname, String lastname, String phone, String email, String address,
			String status) {
		this.employee_code = employee_code;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.status = status;
	}
	public int getEmployee_code() {
		return employee_code;
	}
	public void setEmployee_code(int employee_code) {
		this.employee_code = employee_code;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
public static ResultSet viewdate() {
	String host="jdbc:mysql://localhost/employee_attendance";
	String user="root";
	String password="";
	String sql="SELECT * FROM employee";
	try {
	Connection con=DriverManager.getConnection(host,user,password);
	PreparedStatement preparedStatement=con.prepareStatement(sql);
	return preparedStatement.executeQuery();
	} catch (SQLException e) {
	e.printStackTrace();
	return null;
	}

}
}
