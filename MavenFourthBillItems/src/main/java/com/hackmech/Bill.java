package com.hackmech;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="bill")
public class Bill {

	//temporer for date
	@Id
	@Column(name="billno")
	int billId;
	@Column(name="totalPrice")
	double totalPrice;
	
	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	Set<Product> products;
	
	public Bill() {
		
	}

	public Bill(int billId, double totalPrice, Set<Product> products) {
		super();
		this.billId = billId;
		this.totalPrice = totalPrice;
		this.products = products;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}

