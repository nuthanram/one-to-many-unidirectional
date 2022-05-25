package com.ty.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestSaveMobileSim {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String sql="select m from Mobile m";
		Query query=entityManager.createQuery(sql);
		List<Mobile> mobiles=query.getResultList();
		for (Mobile mobile : mobiles) {
			System.out.println("***********");
			System.out.println(mobile);
			System.out.println("***********");
			List<Sim> sims=mobile.getSim();
			System.out.println(mobile);
			for (Sim sim : sims) {
				System.out.println(sim);
				System.out.println("***********");
			}
		}
		
	}
}
