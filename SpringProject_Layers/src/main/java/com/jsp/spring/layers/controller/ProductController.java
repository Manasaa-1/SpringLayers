package com.jsp.spring.layers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jsp.spring.layers.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;


   public  String addProduct() {
	  return productService.addProduct();
   }
	
}
