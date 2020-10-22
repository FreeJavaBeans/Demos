package com.revature.protorestaurant;

import java.util.List;

import com.revature.oop.Eater;
import com.revature.oop.Food;

/**
 * @author Alec
 *
 */
public class Order {

	private List<Food> orderItems;
	
	private Eater orderer;
	
	//maybe time
	
	//maybe table number
	
	//don't allow order creation without items and eater
	public Order(List<Food> orderItems, Eater orderer) {
		super();
		this.orderItems = orderItems;
		this.orderer = orderer;
	}
	

	public List<Food> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Food> orderItems) {
		this.orderItems = orderItems;
	}

	public Eater getOrderer() {
		return orderer;
	}

	public void setOrderer(Eater orderer) {
		this.orderer = orderer;
	}


	@Override
	public String toString() {
		return "Order [orderItems=" + orderItems + ", orderer=" + orderer + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderItems == null) ? 0 : orderItems.hashCode());
		result = prime * result + ((orderer == null) ? 0 : orderer.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderItems == null) {
			if (other.orderItems != null)
				return false;
		} else if (!orderItems.equals(other.orderItems))
			return false;
		if (orderer == null) {
			if (other.orderer != null)
				return false;
		} else if (!orderer.equals(other.orderer))
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
}
