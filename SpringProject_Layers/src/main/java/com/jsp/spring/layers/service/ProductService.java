package com.jsp.spring.layers.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring.layers.entity.Product;
import com.jsp.spring.layers.repository.ProductRepository;


@Service
public class ProductService {
@Autowired
private ProductRepository productRepositary;
Scanner scanner= new Scanner(System.in);
public String addProduct() {
	Product product = new Product();
	System.out.println("Enter ProductId : ");
	product.setProductId(scanner.nextInt());
	System.out.println("Enter ProductName : ");
	product.setProductName(scanner.next());
	System.out.println("Enter ProductPrice : ");
	product.setProductPrice(scanner.nextInt());

	productRepositary.addProduct(product);

	return "Data saved sucessfully!!!!";
}
}
