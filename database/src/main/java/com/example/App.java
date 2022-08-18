package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
       Student s=ac.getBean(Student.class);
/*       Scanner sc=new Scanner(System.in);
      System.out.println("enter student id");
      s.setSid(sc.nextInt());
       System.out.println("enter student name");
       s.setName(sc.next());*/
       StudentDAO dao=ac.getBean(StudentDAO.class);
 /*      if(dao.insert(s)>0) {
    	   System.out.println("insertion is successfull");
       }
      else {
    	   System.out.println("insertion failed");
       }*/
       
       List<Student> ss=dao.getallstudents();
       for(Student student:ss) {
    	   System.out.println(student.getSid()+"   "+student.getName());
       }
       
    }
}



