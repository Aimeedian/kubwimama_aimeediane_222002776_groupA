package entities;

public class holiday {
private  int id;	
private String employee_name;
private String holiday_type;
private String startdate;
private String enddate;
private String supportdocument;
public holiday(int id, String employee_name, String holiday_type, String startdate, String enddate,
		String supportdocument) {
	super();
	this.id = id;
	this.employee_name = employee_name;
	this.holiday_type = holiday_type;
	this.startdate = startdate;
	this.enddate = enddate;
	this.supportdocument = supportdocument;
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
public String getHoliday_type() {
	return holiday_type;
}
public void setHoliday_type(String holiday_type) {
	this.holiday_type = holiday_type;
}
public String getStartdate() {
	return startdate;
}
public void setStartdate(String startdate) {
	this.startdate = startdate;
}
public String getEnddate() {
	return enddate;
}
public void setEnddate(String enddate) {
	this.enddate = enddate;
}
public String getSupportdocument() {
	return supportdocument;
}
public void setSupportdocument(String supportdocument) {
	this.supportdocument = supportdocument;
}

}
