package com.rest;

import javax.persistence.EntityManager;



public class CardDaoImpl implements CardDao {

	@Override
	public CardObject getCardObject(String cardNo) {
		CardObject cObj = null;
		try {
		EntityManager em = JPAUtil.getEntityManager();
		cObj = em.find(CardObject.class, cardNo);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return cObj;
	}

}
	