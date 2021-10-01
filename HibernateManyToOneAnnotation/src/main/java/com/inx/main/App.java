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
      
//        //First employee
//        Employee e1 = new Employee();
//        e1.setName("Aditya");
//        e1.setEmail("aditya.inexture@gmail.com");
//        
//        //Second employee
//        Employee e2 = new Employee();
//        e2.setName("Suraj");
//        e2.setEmail("suraj.mbbs@gmail.com");
//      
//        //Office Address
//        Address a1 = new Address();
//        a1.setStreet("sola");
//        a1.setCity("Ahmedabad");
//        a1.setState("Gujarat");
//        a1.setPincode(382506);
//
//        e1.setAddress(a1);
//		e2.setAddress(a1);
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
