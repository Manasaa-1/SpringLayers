package com.jsp.spring.layers.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

import org.springframework.stereotype.Repository;

import com.jsp.spring.layers.entity.Product;

@Repository
public class ProductRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
	public void addProduct(Product product) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		em.persist(product);

		et.commit();
		em.close();
	}
}
