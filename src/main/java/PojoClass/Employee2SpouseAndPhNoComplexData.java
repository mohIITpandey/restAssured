package PojoClass;

public class Employee2SpouseAndPhNoComplexData {
String Ename;
int eid;
long []phno;
Spouse spouse;
public Employee2SpouseAndPhNoComplexData(String ename, int eid, long[] phno, Spouse spouse) {
	super();
	Ename = ename;
	this.eid = eid;
	this.phno = phno;
	this.spouse = spouse;
}
public Employee2SpouseAndPhNoComplexData() {
	super();
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public long[] getPhno() {
	return phno;
}
public void setPhno(long[] phno) {
	this.phno = phno;
}
public Spouse getSpouse() {
	return spouse;
}
public void setSpouse(Spouse spouse) {
	this.spouse = spouse;
}

}
