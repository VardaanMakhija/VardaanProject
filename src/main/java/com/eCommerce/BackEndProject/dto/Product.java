package com.eCommerce.BackEndProject.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product implements Serializable {

	public static final long serialVerionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.Auto)
	private Long id;

	private String brand;

	private String name;
	private String description;
	private String supplier;
	private String productImg_url;

	private int price;
	private int quantity;
	private boolean ActiveIs = true;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getProductImg_url() {
		return productImg_url;
	}

	public void setProductImg_url(String productImg_url) {
		this.productImg_url = productImg_url;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isActiveIs() {
		return ActiveIs;
	}

	public void setActiveIs(boolean activeIs) {
		ActiveIs = activeIs;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ", name=" + name + ", description=" + description
				+ ", supplier=" + supplier + ", productImg_url=" + productImg_url + ", price=" + price + ", quantity="
				+ quantity + ", ActiveIs=" + ActiveIs + "]";
	}

}
