package com.nneville.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.nneville.bo.Product;

public interface ProductDao {
	
	public Product addProduct(Product product, SqlMapClient sqlmapClient);
	
	public Product getProductById(String barcode, SqlMapClient sqlmapClient);

}
