package com.example; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
//       Capacinoo cap=ac.getBean(Capacinoo.class);
//       cap.typeOfCoffee();
//       cap.rateOfCoffee();
       
       
//       Xpreso xpr=ac.getBean(Xpreso.class);
//       xpr.rateOfCoffee();
       
       Capacinoo coffe = ac.getBean(Capacinoo.class);
       coffe.rateOfCoffee();
       System.out.println(coffe.getCream());
    }
}
