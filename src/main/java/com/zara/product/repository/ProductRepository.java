package com.zara.product.repository;

import java.time.LocalDateTime;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import com.zara.product.model.Product;


@Repository 
public interface ProductRepository extends CrudRepository<Product ,Long>{

	List<Product> findAll();

	@Query(value = "SELECT * FROM PRODUCT WHERE BRAND_ID = :brandId AND PRODUCT_ID =:productId "
			+ "AND START_DATE < :whichDate AND END_DATE > :whichDate GROUP BY PRICE_LIST HAVING MAX(PRIORITY)", nativeQuery = true) 
	Product selectRightPriceByDate( 
			@Param("brandId") String brandId,
			@Param("productId") String productId,
			@Param("whichDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime whichDate
			);
}
