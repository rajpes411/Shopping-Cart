package com.rest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	static EntityManager em;

	public static EntityManager getEntityManager() {
		if(em==null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("cardentity");
			em = emf.createEntityManager();
		}
		return em;
	}
	
}
