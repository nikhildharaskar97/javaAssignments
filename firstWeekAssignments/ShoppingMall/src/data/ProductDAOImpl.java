package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Product;

public class ProductDAOImpl implements ProductDAOInterface{
	
	 Connection con = DataManager.getConnection();
	
	@Override
	public ArrayList<Product> getAllProducts(){
		
		ArrayList<Product> blist = new ArrayList<Product>();
		Statement st;
		try {
			st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from Product");
		
		while(rs.next()) {
			Product Product = new Product(rs.getInt(1),rs.getString(2),rs.getInt(3));
			blist.add(Product);
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		
		
		
		
		return blist;
	}
	
	public String addProduct(Product b) {
		int res=0;
		PreparedStatement ps;
		try {
			
			
			String sql = "insert into Product values (?,?,?)";
			
			 ps = con.prepareStatement(sql);
			ps.setInt(1, b.getpID());
			ps.setString(2, b.getpName());
			ps.setInt(3, b.getpPrice());
			
			 res = ps.executeUpdate();// this is for DML  statement
			
			
			
			con.close();  
			}catch(Exception e){ System.out.println(e);} 
		
			
			if(res!=1) {
				return ("Insertion failed!");
			}
			else {
				return ("Product inserted successfully!");
			}
	
	}

	@Override
	public boolean updatePrice(int pID, int pPrice) {
		// TODO Auto-generated method stub
		
		PreparedStatement ps;
		int rs=0;
		boolean flag = false;
		
		String query = "UPDATE Product SET pPrice = ? WHERE (Productid = ?)";
		try {
			ps = con.prepareStatement(query);
		
		ps.setInt(1, pPrice);
		ps.setInt(2, pID);
		
		rs = ps.executeUpdate();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(rs==1) {
			flag =true;
		}
		
		return flag;
	}

	@Override
	public Product getProductByName(String name) {
		
		Statement s;
		Product b=null;
		
		try {
			s = con.createStatement();
		
		ResultSet rs = s.executeQuery("Select * from Product where pName ='"+ name+"'") ;
		while(rs.next()) {
			b=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3));
		}
		
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
}
