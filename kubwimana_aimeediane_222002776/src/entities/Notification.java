package entities;

public class Notification {
private int id;
private String employee_name;
private String type;
private String content;
private String status;
public Notification(int id, String employee_name, String type, String content, String status) {
	super();
	this.id = id;
	this.employee_name = employee_name;
	this.type = type;
	this.content = content;
	this.status = status;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployee_name() {
	return employee_name;
}
public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}
