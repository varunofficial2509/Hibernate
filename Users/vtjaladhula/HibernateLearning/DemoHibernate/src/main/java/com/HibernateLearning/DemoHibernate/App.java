package com.HibernateLearning.DemoHibernate;

import java.util.Collection;

import javax.management.openmbean.OpenDataException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class App 
{
    public static void main( String[] args )
    {
//        Student stu = new Student();
//        stuName st= new stuName();
//        Laptop l = new Laptop();
//        l.setLid(5);
//        l.setLname("Lenevo");
//        
//        
//        
//        st.setFname("Sri");
//        st.setLname("Vodnala");
//        st.setMname("Charan");
//        
//        
//        stu.setAid(103);
//        stu.setAname(st);
//        stu.setIntrest("Maths");
//        
//        stu.getLaptop().add(l);
//        l.setStu(stu);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        
        ServiceRegistry reg =  new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        		
        SessionFactory sf = con.buildSessionFactory(reg);
        
        
        Session s1 = sf.openSession();
        //Transaction tx = s.beginTransaction() ;
        s1.beginTransaction(); // above commented line and this does same job
        
        Student s = s1.get(Student.class, 101);
        System.out.println(s.getAname());
        
        s1.getTransaction().commit();
        s1.close();
        
        Session s2 = sf.openSession();
        s2.beginTransaction();
        
        Student a = s2.get(Student.class, 101);
        System.out.println(a.getAname());
        
        s2.getTransaction().commit();
        s2.close();
        
        
        
    

//        Collection<Laptop> laps = s1.getLaptop();
//        for(Laptop l : laps)
//        {
//        	System.out.println(l);
//        }
        //s.getTransaction().commit();
        
    }
}
