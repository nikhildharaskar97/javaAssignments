package model;

public class Product {
	private int pID;
	private String pName;
	private int pPrice;
	public Product(int pID, String pName, int pPrice) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	public int getpID() {
		return pID;
	}
	public String getpName() {
		return pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pID=" + pID + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
	
	
	
}
