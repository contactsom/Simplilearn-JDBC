package com.simplilearn.mapping;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="orderId")
	private int orderId;
	
	@Column(name="totalQty")
	private int totalQty;
	
	@Column(name="totalCost")
	private Double totalCost;
	
	@Column(name="orderDate")
	private Date orderDate;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name="cid",referencedColumnName="cid")
	Customer customer;
	/*CID is the PK of customers table which becomes FK for orders using tag called
	 * referencedColumnName="cid"
	 *  */
	
	
	public Order(){}


	public Order(int totalQty, Double totalCost, Date orderDate, String status) {
	
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
		this.status = status;
		
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getTotalQty() {
		return totalQty;
	}


	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}


	public Double getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	

	
	
	

}
