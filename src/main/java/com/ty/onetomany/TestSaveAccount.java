package com.ty.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAccount {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User_account account=new User_account();
		account.setName("nuthan");
		account.setMobile(9606238102l);
		account.setEmail("nuth@gmail.com");
		account.setPassword("kallumelekallu");
		Page page1=new Page();
		page1.setDescription("art");
		page1.setName("artistic_colors");
		page1.setTitle("crazy_art_mania");
		Page page2=new Page();
		page2.setDescription("business");
		page2.setName("beardo");
		page2.setTitle("product_beard");
		
		List<Page> pages=new ArrayList<Page>();
		pages.add(page1);pages.add(page2);
		account.setPage(pages);
		entityTransaction.begin();
		entityManager.persist(account);
		entityManager.persist(page1);
		entityManager.persist(page2);
		entityTransaction.commit();
		System.out.println("done");
	}
}
