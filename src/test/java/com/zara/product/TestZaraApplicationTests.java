package com.zara.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;

import com.zara.product.model.Product;
import com.zara.product.service.ProductServiceImpl;

@SpringBootTest
class TestZaraApplicationTests {
	
	@Autowired
	private ProductServiceImpl productService;

	@Test
		void getRightPrice() throws ParseException {

		Product product;
		String brandId="1";
		String productId="35455";
		String whichDate1 = "2020-06-14T10:00:00";
		String whichDate2 = "2020-06-14T16:00:00";
		String whichDate3 = "2020-06-14T21:00:00";
		String whichDate4 = "2020-06-15T10:00:00";
		String whichDate5 = "2020-06-16T21:00:00";
		
    	LocalDateTime which_Date1 = LocalDateTime.parse(whichDate1);
    	product = productService.selectRightPriceByDate(brandId, productId,which_Date1); 
    	assertNull(null,"Product is null");	
		
    	LocalDateTime which_Date2 = LocalDateTime.parse(whichDate2); 
    	product = productService.selectRightPriceByDate(brandId, productId,which_Date2); 
    	assertEquals("2",product.getPrice_list());
    	assertEquals("25,45",product.getPrice());

    	LocalDateTime which_Date3 = LocalDateTime.parse(whichDate3); 
		product = productService.selectRightPriceByDate(brandId, productId,which_Date3); 
		assertNull(null,"Product is null");
		
    	LocalDateTime which_Date4 = LocalDateTime.parse(whichDate4); 
		product = productService.selectRightPriceByDate(brandId, productId,which_Date4); 
		assertEquals("3",product.getPrice_list());
    	assertEquals("30,50",product.getPrice());
    	
    	LocalDateTime which_Date5 = LocalDateTime.parse(whichDate5); 
		product = productService.selectRightPriceByDate(brandId, productId,which_Date5); 
		assertEquals("4",product.getPrice_list());
    	assertEquals("38,95",product.getPrice());
    	
    }
    
}
