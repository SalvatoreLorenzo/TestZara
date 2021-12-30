package com.zara.product.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long id;
	@Column(name="brand_id")
	public String brand_id;
	@Column(name="start_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date start_date; 
	@Column(name="end_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date end_date;
	@Column(name="price_list")
	public String price_list;
	@Column(name="product_id")
	public String product_id;
	@Column(name="priority")
	public int priority;
	@Column(name="price")
	public String price;
	@Column(name="curr")
	public String curr;
		
	public Product() {
		super();
	}
	
	public Product(Long id, String brand_id, Date start_date, Date end_date, String price_list, String product_id,
			int priority, String price, String curr) {
		super();
		this.id = id;
		this.brand_id = brand_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.price_list = price_list;
		this.product_id = product_id;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getPrice_list() {
		return price_list;
	}
	public void setPrice_list(String price_list) {
		this.price_list = price_list;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", brand_id=" + brand_id + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", price_list=" + price_list + ", product_id=" + product_id + ", priority=" + priority + ", price="
				+ price + ", curr=" + curr + "]";
	}
	
}
