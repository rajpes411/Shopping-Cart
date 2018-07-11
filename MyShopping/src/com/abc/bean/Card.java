package com.abc.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Card {
	private int id;
	private String cardNo;
	private String name;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date expiry;
	private int cvv;
	private int itemId;
	private long mob;
	private int quantity;
	public Card(int id, String cardNo, String name, Date expiry, int cvv, int itemId, long mob, int quantity,
			int maxQuantity) {
		super();
		this.id = id;
		this.cardNo = cardNo;
		this.name = name;
		this.expiry = expiry;
		this.cvv = cvv;
		this.itemId = itemId;
		this.mob = mob;
		this.quantity = quantity;
		this.maxQuantity = maxQuantity;
	}
	private int maxQuantity;
	
	public int getMaxQuantity() {
		return maxQuantity;
	}
	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public Card(int id, String cardNo, String name, Date expiry, int cvv, int itemId) {
		super();
		this.id = id;
		this.cardNo = cardNo;
		this.name = name;
		this.expiry = expiry;
		this.cvv = cvv;
		this.itemId = itemId;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Card [id=" + id + ", cardNo=" + cardNo + ", name=" + name + ", expiry=" + expiry + ", cvv=" + cvv
				+ ", itemId=" + itemId + ", mob=" + mob + ", quantity=" + quantity + "]";
	}
	public Card(int id, String cardNo, String name, Date expiry, int cvv, int itemId, long mob, int quantity) {
		super();
		this.id = id;
		this.cardNo = cardNo;
		this.name = name;
		this.expiry = expiry;
		this.cvv = cvv;
		this.itemId = itemId;
		this.mob = mob;
		this.quantity = quantity;
	}
	
	
	
	
	
	
	}

