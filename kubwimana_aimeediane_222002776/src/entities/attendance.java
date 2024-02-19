package entities;

public class attendance {
private  int id;
private int employee_code;
private String date;
private String time_in;
private String time_out;
private String workedhours;
public attendance() {}
public attendance(int id, int employee_code, String date, String time_in, String time_out, String workedhours) {
	super();
	this.id = id;
	this.employee_code = employee_code;
	this.date = date;
	this.time_in = time_in;
	this.time_out = time_out;
	this.workedhours = workedhours;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getEmployee_code() {
	return employee_code;
}
public void setEmployee_code(int employee_code) {
	this.employee_code = employee_code;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime_in() {
	return time_in;
}
public void setTime_in(String time_in) {
	this.time_in = time_in;
}
public String getTime_out() {
	return time_out;
}
public void setTime_out(String time_out) {
	this.time_out = time_out;
}
public String getWorkedhours() {
	return workedhours;
}
public void setWorkedhours(String workedhours) {
	this.workedhours = workedhours;
}


}
