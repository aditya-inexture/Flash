package com.inx.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
        
//		HashSet<String> a1 = new HashSet<String>();
//		a1.add("JAVA is a programming language");
//		a1.add("JAVA is a platform");
//		
//		HashSet<String> a2 = new HashSet<String>();
//		a2.add("Servlet is an interface");
//		a2.add("Servlet is an API");
//		
//		Question q1 = new Question();
//		q1.setQuestion("What is JAVA?");
//		q1.setAnswers(a1);
//		
//		Question q2 = new Question();
//		q2.setQuestion("What is Servlet?");
//		q2.setAnswers(a2);
//        
//		qa.save(q1);
//		qa.save(q2);
        
        List<Question> q_a = qa.getQuestionAnswers();
        Iterator<Question> itr = q_a.iterator();
        while(itr.hasNext()) {
        	Question q = itr.next();
        	System.out.println("Question Name: "+ q.getQuestion());
        	
        	Set<String> list2 = q.getAnswers();
        	Iterator<String> itr2 = list2.iterator();
        	while(itr2.hasNext()) {
        		System.out.println("- " + itr2.next());
        	}
        }
		
    }
}
