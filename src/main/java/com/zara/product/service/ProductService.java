package com.zara.product.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zara.product.model.Product;

@Component
public interface ProductService  {

	public List<Product> findAll();
	public Product selectRightPriceByDate(String brandId,String productId,LocalDateTime whichDate);

}
