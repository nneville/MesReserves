package com.nneville.rest;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.nneville.bo.Product;
import com.nneville.dao.ProductDao;
import com.nneville.dao.ProductDaoImpl;

public class TestCreate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	       //Initialize dao
        ProductDao manager = new ProductDaoImpl();
 
        //Create the SQLMapClient
        Reader reader = Resources.getResourceAsReader("dao/sqlMapConfig.xml");
        SqlMapClient sqlmapClient = SqlMapClientBuilder.buildSqlMapClient (reader);
 
        //Create a new user to persist
        Product product = new Product();
        product.setBarcode("1");
        product.setLabel("Demo User");
        product.setQuantity(4);
 
        //Add the user
        manager.addProduct(product,sqlmapClient);
 
        //Fetch the user detail
        Product createdUser = manager.getProductById("1", sqlmapClient);
        System.out.println(createdUser.getLabel());
 
        //Lets delete the user
        //manager.deleteUserById(1, sqlmapClient);
		
	}

}
