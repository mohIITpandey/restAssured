package PojoClass;

public class Spouse {
String name;
int age;
long[]phNo;
public Spouse(String name, int age, long[] phNo) {
	super();
	this.name = name;
	this.age = age;
	this.phNo = phNo;
}

public Spouse() {
	super();
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long[] getPhNo() {
	return phNo;
}
public void setPhNo(long[] phNo) {
	this.phNo = phNo;
}
}
