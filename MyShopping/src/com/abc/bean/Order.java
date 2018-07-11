package com.abc.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="order_hib")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String custName;
	private long custMobile;
	private int ItemId;
	private int quantity;
	private Date purchaceDate;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(int id, String custName, long custMobile, int itemId, int quantity, Date purchaceDate) {
		super();
		this.id = id;
		this.custName = custName;
		this.custMobile = custMobile;
		ItemId = itemId;
		this.quantity = quantity;
		this.purchaceDate = purchaceDate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public long getCustMobile() {
		return custMobile;
	}


	public void setCustMobile(long custMobile) {
		this.custMobile = custMobile;
	}


	public int getItemId() {
		return ItemId;
	}


	public void setItemId(int itemId) {
		ItemId = itemId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Date getPurchaceDate() {
		return purchaceDate;
	}


	public void setPurchaceDate(Date purchaceDate) {
		this.purchaceDate = purchaceDate;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", custName=" + custName + ", custMobile=" + custMobile + ", ItemId=" + ItemId
				+ ", quantity=" + quantity + ", purchaceDate=" + purchaceDate + "]";
	}
	
	
	
	

}
