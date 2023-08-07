package PojoClass;

public class Employee {
  String Ename;
  String Designation;
  int eid;
  long phoneNo;
public Employee(String ename, String designation, int eid, long phoneNo) {
	super();
	Ename = ename;
	Designation = designation;
	this.eid = eid;
	this.phoneNo = phoneNo;
}
public Employee() {
	super();
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
} 
}
