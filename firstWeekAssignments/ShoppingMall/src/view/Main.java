package view;

import java.util.*;

import com.telstra.userpack.admin;

import data.ProductDAOImpl;
import model.Product;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		admin a = new admin();
		ProductDAOImpl pil = new ProductDAOImpl();
		
		
		while(true) {
			System.out.println("1. Admin Login");
			System.out.println("2. User Login");
			System.out.println("Enter your choice");
			
			int choice1 = sc.nextInt();
			switch(choice1){
			case 1:{
				System.out.println("Please ener the password");
				String pass = sc.next();
				if(pass == a.getPassword()) {
					while(true) {
					System.out.println("1. Add  a product");
					System.out.println("3. Update Product price by id");
					System.out.println("4. Get a Product by name");
					System.out.println("5. Exit"); 
					System.out.println("Enter your choice");
					
					int choice = sc.nextInt();
					switch(choice){
					case 1:
					{
						System.out.println("Enter the Product id:");
						int pID = sc.nextInt();
						System.out.println("Enter the Product name");
						String pName = sc.next();
						System.out.println("enter the Product price");
						int pPrice = sc.nextInt();
						
						Product b = new Product(pID,pName,pPrice);
						
						System.out.println(pil.addProduct(b)); 				
						break;
					
					}
					
					case 2:
					{
						System.out.println(" Enter the Product id to be updated:");
						int pID = sc.nextInt();
						System.out.println(" Enter the updated price:");
						int pPrice = sc.nextInt();
						if(pil.updatePrice(pID, pPrice)) {
							System.out.println("Product updated succesfully");
						}
						else {
							System.out.println("Product not found");
						}
						
						break;
					}
					case 3:
					{
						
						System.out.println("Eneter name of Product to get the Product");
						String name = sc.next();
						Product b = pil.getProductByName(name);
						if(b==null) {
							System.out.println("Please check the name!");
						}else {
							System.out.println("Product is :"+b);
						}
						 // equals() with strings 
						break;
					}
				
					case 4:
					{	
						sc.close();
						System.exit(0);
					}
					
				}
				
				}
					
				}
				else {
					break;
				}
				
			}
			
			case 2:{
				
				
				while(true){
					
					
					System.out.println("1. Get all products");
					
					System.out.println("2. Get a Product by name");
					System.out.println("3. Exit"); 
					System.out.println("Enter your choice");
					int choice = sc.nextInt();
					switch(choice){
					
					case 1: 
					{
						
						ArrayList<Product> blist= pil.getAllProducts();
						System.out.println();
						for (Product b:blist)
						{
							System.out.println(b);
						}
						System.out.println();
						
						break;
					}
					
					case 2:
					{
						
						System.out.println("Eneter name of Product to get the Product");
						String name = sc.next();
						Product b = pil.getProductByName(name);
						if(b==null) {
							System.out.println("Please check the name!");
						}else {
							System.out.println("Product is :"+b);
						}
						 // equals() with strings 
						break;
					}
				
					case 3:
					{	
						sc.close();
						System.exit(0);
					}
					
				}
				
				
			}
			
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
	
		
		
		
	}
}
