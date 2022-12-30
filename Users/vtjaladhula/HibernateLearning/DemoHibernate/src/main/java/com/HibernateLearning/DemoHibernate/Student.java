package com.HibernateLearning.DemoHibernate;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
@Id
private int aid;
private stuName aname  ;
private String intrest;


// By default the fetch type will be lazy , We need to make it Eager. This makes system to fetch everything at a time
@OneToMany(mappedBy = "stu" , fetch = FetchType.EAGER) // mapped by "stu" in Laptop class
private List<Laptop> laptop = new ArrayList<Laptop>();


public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}

public stuName getAname() {
	return aname;
}
public void setAname(stuName aname) {
	this.aname = aname;
}
public String getIntrest() {
	return intrest;
}
public void setIntrest(String intrest) {
	this.intrest = intrest;
}
public List<Laptop> getLaptop() {
	return laptop;
}
public void setLaptop(List<Laptop> laptop) {
	this.laptop = laptop;
}



}
