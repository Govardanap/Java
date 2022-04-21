package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demoex3Application {

	public static void main(String[] args) {
		//SpringApplication.run(Demoex3Application.class, args);
ApplicationContext ctx=new ClassPathXmlApplicationContext("prodcut.xml");
ProdcutDAO dao=(ProdcutDAO) ctx.getBean("pdao");
Prodcut p=(Prodcut) ctx.getBean("prodcut");
System.out.println(dao.addProdcut(p));


	}

}
