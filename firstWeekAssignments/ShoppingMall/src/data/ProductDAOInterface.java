package data;

import java.util.ArrayList;

import model.Product;

public interface ProductDAOInterface {
	ArrayList<Product> getAllProducts();
	String addProduct(Product b);
	boolean updatePrice(int pID,int pPrice);
	Product getProductByName(String pName);
	
}
