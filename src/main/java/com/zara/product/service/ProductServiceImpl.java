package com.zara.product.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zara.product.model.Product;
import com.zara.product.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
	
	
	private Map<String,Product> map = new HashMap<String,Product>(); 
	
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>(map.values());
		productRepository.findAll().forEach(product1 -> products.add(product1));
		return products;
	}
	
	@Override
	public Product selectRightPriceByDate(String brandId, String productId, LocalDateTime whichDate) {
		return productRepository.selectRightPriceByDate(brandId, productId, whichDate);
	}

}
