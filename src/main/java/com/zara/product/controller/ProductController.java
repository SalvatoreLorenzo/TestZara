package com.zara.product.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zara.product.model.Product;
import com.zara.product.service.ProductService;
import com.zara.product.service.ProductServiceImpl;

@RestController
public class ProductController {


	@Autowired
	ProductService productService;

	@Autowired
	public ProductController(ProductServiceImpl productService) {
		this.productService = productService;
	} 

	@GetMapping(value = "/products")
	@ResponseBody
	public List<Product> findAll() {
		return (ArrayList<Product>) productService.findAll();
	}

	@GetMapping(value = "/rightproduct/{brandId}/{productId}/{whichDate}")
	public Product  getRightPrice(@RequestParam String brandId,	@RequestParam String productId,	@RequestParam String whichDate) {
		LocalDateTime which_Date = LocalDateTime.parse(whichDate);
		return productService.selectRightPriceByDate(brandId,productId,which_Date);
	}

}

