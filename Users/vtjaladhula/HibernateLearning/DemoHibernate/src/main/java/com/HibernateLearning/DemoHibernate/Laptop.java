package com.HibernateLearning.DemoHibernate;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;




@Entity
public class Laptop {
	
@Id
private int lid;
private String lname;

@ManyToOne
private Student stu;

public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}



public Student getStu() {
	return stu;
}
public void setStu(Student stu) {
	this.stu = stu;
}
@Override
public String toString() {
	return "Laptop [lid=" + lid + ", lname=" + lname + "]";
}


}
