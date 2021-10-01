package com.inx.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inx.dao.EmployeeDAO;
import com.inx.model.Address;
import com.inx.model.Employee;


/**
 * Employee registration
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDAO qa = context.getBean("empDAO",EmployeeDAO.class);
        
//        //Employee 1 details
//        Address a1 = new Address();
//        a1.setStreet("c-16/17");
//        a1.setCity("Ahmedabad");
//        a1.setState("Gujarat");
//        a1.setPincode(382405);
//        
//        Employee e1 = new Employee();
//        e1.setName("Aditya");
//        e1.setEmail("aditya.inexture@gmail.com");
//        a1.setEmployee(e1);
//		e1.setAddress(a1);
//		
//		//Employee 2 details
//        Address a2 = new Address();
//        a2.setStreet("b-12");
//        a2.setCity("Surat");
//        a2.setState("Gujarat");
//        a2.setPincode(34568);
//        
//        Employee e2 = new Employee();
//        e2.setName("Suraj");
//        e2.setEmail("suraj.mbbs@gmail.com");
//    	a2.setEmployee(e2);
//		e2.setAddress(a2);
//		
//		
//		qa.save(e1);
//		qa.save(e2);

        List<Employee> list = qa.getEmployee();
        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext()) {
        	Employee e = itr.next();
        	System.out.println("Employee id: " + e.getEmployeeId());
        	System.out.println("Name: " + e.getName());
        	System.out.println("Email: " + e.getEmail());
        	
        	Address adrs = e.getAddress();
        	System.out.println(adrs.getStreet()+", "+adrs.getCity()+", "+adrs.getState()+"-"+adrs.getPincode());	
        }
        
    }
}
