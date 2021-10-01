package com.inx.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inx.dao.QuestionDAO;
import com.inx.model.Answer;
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
        
        
		//Answers
        
		Answer q1a1 = new Answer();
		q1a1.setAnswerName("JAVA is a programming language");
		q1a1.setPostedBy("Aditya");
		
		Answer q1a2 = new Answer();
		q1a2.setAnswerName("AVA is a platform");
		q1a2.setPostedBy("Vivek");
		
		Answer q2a1 = new Answer();
		q2a1.setAnswerName("Servlet is an interface");
		q2a1.setPostedBy("Suraj");
		
		Answer q2a2 = new Answer();
		q2a2.setAnswerName("Servlet is an API");
		q2a2.setPostedBy("Narendra");
		
		List<Answer> answer1 = new ArrayList<Answer>();
		answer1.add(q1a1);
		answer1.add(q1a2);
		
		List<Answer> answer2 = new ArrayList<Answer>();
		answer2.add(q2a1);
		answer2.add(q2a2);
		
		//Questions
		
		Question q1 = new Question();
		q1.setQuestion("What is JAVA?");
		q1.setAnswers(answer1);
		
		Question q2 = new Question();
		q2.setQuestion("What is Servlet?");
		q2.setAnswers(answer2);
        
		qa.save(q1);
		qa.save(q2);
        
//        List<Question> q_a = qa.getQuestionAnswers();
//        Iterator<Question> itr = q_a.iterator();
//        while(itr.hasNext()) {
//        	Question q = itr.next();
//        	System.out.println("Question Name: "+ q.getQuestion());
//        	
//        	List<String> list2 = q.getAnswers();
//        	Iterator<String> itr2 = list2.iterator();
//        	while(itr2.hasNext()) {
//        		System.out.println("- " + itr2.next());
//        	}
//        }
		
    }
}
