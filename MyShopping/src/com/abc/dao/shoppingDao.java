package com.abc.dao;

import java.util.List;

import com.abc.bean.Card;
import com.abc.bean.Item;
import com.abc.bean.Order;

public interface shoppingDao {

	List<Item> getItems();

	Item getItem(Item item);

	Order buyItem(Card card);

}
