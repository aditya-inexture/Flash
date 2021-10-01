package com.inx.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inx.dao.QuestionDAO;
import com.inx.model.Question;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        QuestionDAO qa = context.getBean("queDAO",QuestionDAO.class);
        
//		HashMap<String,String> a1 = new HashMap<String,String>();
//		a1.put("JAVA is a programming language","Aditya Singh");
//		a1.put("JAVA is a platform independent","Vivek Shukla");
//		
//		HashMap<String,String> a2 = new HashMap<String,String>();
//		a2.put("Servlet is an interface","Suraj Kushwaha");
//		a2.put("Servlet is an API","Narendra Prajapati");
//		
//		Question q1 = new Question("What is JAVA?","Ramgopal Verma",a1);
//		
//		Question q2 = new Question("What is Servlet?","Narendra Modi",a2);
//        
//		qa.save(q1);
//		qa.save(q2);
        
        List<Question> q_a = qa.getQuestionAnswers();
        Iterator<Question> itr = q_a.iterator();
        while(itr.hasNext()) {
        	Question q = itr.next();
        	System.out.println("----------------------------------------------------------------------");
        	System.out.println("Question id: " + q.getQid());
        	System.out.println("Question Name: "+ q.getQuestion());
        	System.out.println("Question posted by: "+ q.getUsername());
        	System.out.println("###### ANSWERS ######");
        	Map<String,String> map = q.getAnswers();
        	Set<Map.Entry<String, String>> set = map.entrySet();
        	Iterator<Map.Entry<String, String>> itr2 = set.iterator();
        	while(itr2.hasNext()) {
        		Map.Entry<String, String> entry = (Map.Entry<String, String>) itr2.next();
        		System.out.println("answer name:  " + entry.getKey());
        		System.out.println("answer posted by: " + entry.getValue());
        	}
        }
		
    }
}
