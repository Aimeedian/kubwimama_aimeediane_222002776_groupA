package entities;

public class permission {
private int id;
private String employeename;
private String reasonforleave;
private String date;
private String timeforleave;
private String timeforback;
private String leavetype;
public permission(int id, String employeename, String reasonforleave, String date, String timeforleave,
		String timeforback, String leavetype) {
	this.id = id;
	this.employeename = employeename;
	this.reasonforleave = reasonforleave;
	this.date = date;
	this.timeforleave = timeforleave;
	this.timeforback = timeforback;
	this.leavetype = leavetype;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getReasonforleave() {
	return reasonforleave;
}
public void setReasonforleave(String reasonforleave) {
	this.reasonforleave = reasonforleave;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTimeforleave() {
	return timeforleave;
}
public void setTimeforleave(String timeforleave) {
	this.timeforleave = timeforleave;
}
public String getTimeforback() {
	return timeforback;
}
public void setTimeforback(String timeforback) {
	this.timeforback = timeforback;
}
public String getLeavetype() {
	return leavetype;
}
public void setLeavetype(String leavetype) {
	this.leavetype = leavetype;
}

}
