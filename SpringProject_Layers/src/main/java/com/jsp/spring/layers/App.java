package com.jsp.spring.layers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring.layers.controller.ProductController;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
       ProductController pc=ac.getBean(ProductController.class);
       System.out.println(pc.addProduct());
    }
}
