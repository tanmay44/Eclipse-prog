package mypackage;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Employee")
public class Employee {
	
	
@Id
private int id;
private   String firstName,lastName;
private String college;
private String company_name;
private String designation;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}


public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}

public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
	
}


