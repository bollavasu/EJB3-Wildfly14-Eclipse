package com.vasu.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CustomerBean
 */
@Stateless
@LocalBean
public class CustomerBean {

   public String sayHello(String name) {
	   System.out.println("FROM CustomerBean sayHello()");
	   return "HELLO " +  name + ", HOW ARE YOU ?";
   }
}
