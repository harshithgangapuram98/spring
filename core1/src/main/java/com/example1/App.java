package com.example1;

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
    	//IoC
      ApplicationContext ac = new ClassPathXmlApplicationContext("spring1.XML");
      				
      				//BY using IoC object we are requesting the IoC to supply the object for Capacinoo class  
      
      Capacinoo capa= ac.getBean(Capacinoo.class);
      capa.typeOfCoffee();
      capa.rateOfCoffee();
      System.out.println(capa.getCream());
      
      
      
      Xpreso exp= ac.getBean(Xpreso.class);
      exp.typeOfCoffee();
      exp.rateOfCoffee();
      
    }
}