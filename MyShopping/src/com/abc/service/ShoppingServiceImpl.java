package com.abc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.bean.Card;
import com.abc.bean.Item;
import com.abc.bean.Order;
import com.abc.dao.shoppingDao;

@Transactional
@Service
public class ShoppingServiceImpl implements ShoppingService {
	@Autowired
    private shoppingDao sDao;
	@Autowired
	private CardService cardService;
	@Override
	public List<Item> getItems() {
		
		return sDao.getItems();
	}
	@Override
	public Item getItem(Item item) {
		System.out.println("returning item antlr.collections.List .class...");
		return sDao.getItem(item);
	}
	@Override
	public Order buyItem(Card card) {
		boolean cardValid=cardService.validateCard(card);
	if(cardValid) {
		return sDao.buyItem(card);
	}
	return null;	
	}

}
