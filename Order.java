package com.mindtree.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "order_tbl")
public class Order {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@Column(name = "order_number")
	private String orderNumber;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	@Override
	public String toString() {
		return "Order [Id=" + Id + ", orderNumber=" + orderNumber + "]";
	}

	
	
}
