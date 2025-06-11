package com.hackmech;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {

	@Id
	@Column(name="productid")
	int productId;
	@Column(name="productname")
	String productName;
	
	@ManyToOne(targetEntity = Bill.class)
	Bill currentBill;

	public Product() {
		
	}
	
	public Product(int productId, String productName, Bill currentBill) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.currentBill = currentBill;
	}


	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}
