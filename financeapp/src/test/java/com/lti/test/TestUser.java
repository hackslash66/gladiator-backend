package com.lti.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;


import com.lti.entity.Product;
import com.lti.entity.User;




public class TestUser {
private EntityManagerFactory factory;
	
	@Before
	public void init()
	{
		factory =Persistence.createEntityManagerFactory("MyPU");
		
	}
	@Test
	public void testAddProduct() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		Product p1 =new Product();
		p1.setPid(120);
		p1.setPname("vivo");
		p1.setPdetails("good");
		p1.setPrate(5512);
		
		User u1 =em.find(User.class, "jkl");
		p1.setUser(u1);
		
		em.persist(p1);
		txn.commit();
		em.close();
	}
	
	@Test
	public void testAddUser() {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		User u1 =new User();
		u1.setName("Yash");
		u1.setUaddress("jdjd");
		u1.setApprovalstatus("yes");
		u1.setUbankacct("45123");
		u1.setUcardtype("gold");
		u1.setUcontact("97845623");
		u1.setUifsc("45552");
		u1.setUname("jkl");
		u1.setUpwd("mejdj");
		u1.setUemail("yash@gmail.com");
		u1.setBank("HDFC");
		
		em.persist(u1);
		txn.commit();
		em.close();
		
	}
	
	
	
	@Test
	public void testAddUserPro() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		User u1 =new User();
		u1.setName("ash");
		u1.setUaddress("jdjd");
		u1.setApprovalstatus("yes");
		u1.setUbankacct("45123");
		u1.setUcardtype("gold");
		u1.setUcontact("97845623");
		u1.setUifsc("45552");
		u1.setUname("bushkl");
		u1.setUpwd("mejdj");
		u1.setUemail("yash@gmail.com");
		u1.setBank("HDFC");
		
		Product p1 =new Product();
		p1.setPid(20);
		p1.setPname("mi");
		p1.setPdetails("good");
		p1.setPrate(512);
		p1.setUser(u1);
		
		u1.getProducts().add(p1);
		
		em.persist(u1);
		txn.commit();
		em.close();
		
	}
	
	

	@Test
	public void testDeleteDept() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		User u1 =em.find(User.class, "bushkl");
		em.remove(u1);
		txn.commit();
		em.close();
	}
	
	@Test
	public void testFetchDept() {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		User u1 =em.find(User.class, "jkl");
		System.out.println(u1.getName()+"\t"+u1.getBank());
		System.out.println("No of products bought buy user: "+u1.getName()+" is \t"+u1.getProducts().size());
	}
	
	
}
