package com.rest;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="card_hib")
public class CardObject {
	@Id
	private String cardNo;
	private String name;
@Temporal(TemporalType.DATE)
	private Date expiry;
	private int cvv;
	
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
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	@Override
	public String toString() {
		return "CardObject [cardNo=" + cardNo + ", name=" + name + ", expiry=" + expiry + ", cvv=" + cvv + "]";
	}
	public CardObject(String cardNo, String name, Date expiry, int cvv) {
		super();
		this.cardNo = cardNo;
		this.name = name;
		this.expiry = expiry;
		this.cvv = cvv;
	}
	public CardObject() {
		super();
		// TODO Auto-generated constructor stub
	}
		public boolean validate(String cardNo2, String name2, int cvv2) {
		Date today = new Date();
		int diff = today.compareTo(expiry);
		if(cardNo2.equals(cardNo) && name2.equals(name) && cvv2==cvv && diff<0) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	

}
