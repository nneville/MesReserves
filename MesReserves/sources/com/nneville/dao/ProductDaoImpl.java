package com.nneville.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.nneville.bo.Product;


public class ProductDaoImpl implements ProductDao {
	
	
	public Product addProduct(Product product, SqlMapClient sqlmapClient) {
        try
        {
        	//Integer id = (Integer)sqlmapClient.queryForObject("product.getMaxId");
        	//id = id == null ? 1 : id + 1;
        	product.setBarcode("fdsfg");
        	product.setLabel("df,ksjgoz");
        	product.setQuantity(1);

            sqlmapClient.insert("product.addProduct", product);
        	
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
	}
	
	
	public Product getProductById(String barcode, SqlMapClient sqlmapClient) {
        try
        {
        	Product product = (Product)sqlmapClient.queryForObject("product.getProductById", barcode);
            return product;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
