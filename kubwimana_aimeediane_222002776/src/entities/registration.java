package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.print.attribute.standard.PrinterMakeAndModel;
import javax.swing.JOptionPane;

public class registration {
private String names;
private String phone;
private String address;
private String email;
private String username;
private String password;
private String hireddate;
public registration( String names, String phone, String address, String email, String username, String password,
		String hireddate) {

	this.names = names;
	this.phone = phone; 
	this.address = address;
	this.email = email;
	this.username = username;
	this.password = password;
	this.hireddate = hireddate;
}

public String getNames() {
	return names;
}
public void setNames(String names) {
	this.names = names;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getHireddate() {
	return hireddate;
}
public void setHireddate(String hireddate) {
	this.hireddate = hireddate;
}
public void makeconnection() {
	String hoString="jdbc:mysql://localhost:3306/employee_attendance";
	String userString="root";
	String password="";}
	public void insertData() {
		String hoString="jdbc:mysql://localhost:3306/employee_attendance";
		String userString="root";
		String password="";
	String query="INSERT INTO registration(names,phones,address,email,username,password,hireddate) VALUES(?,?,?,?,?,?,?)";
	try {
	Connection con=	DriverManager.getConnection(hoString,userString,password);
	PreparedStatement stm=con.prepareStatement(query);
	 stm.setString(1, this.names);
     stm.setString(2, this.phone);
     stm.setString(3, this.address);
     stm.setString(4, this.email);
     stm.setString(5, this.username);
     stm.setString(6, this.password);
     stm.setString(7, this.hireddate);

     // Execute the query
     int rowsAffected = stm.executeUpdate();

     // Check the result
     if (rowsAffected > 0) {
     	System.out.println("Data inserted successfully!");
         JOptionPane.showMessageDialog(null, "SinUp successfully!","After insert",JOptionPane.INFORMATION_MESSAGE);
     } else {
         System.out.println("Failed to insert data.");
         JOptionPane.showMessageDialog(null, "Failed to SinUp.!","After insert",JOptionPane.ERROR_MESSAGE);

     }

	}
	catch (Exception e) {
		// TODO: handle exception
	}

}}