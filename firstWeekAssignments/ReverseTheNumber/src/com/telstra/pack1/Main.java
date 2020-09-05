package com.telstra.pack1;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * byte a;
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("enter three numbers"); int n1=sc.nextInt(); int
		 * n2=sc.nextInt(); int n3=sc.nextInt();
		 * 
		 * int lar = (n1>n2?n1:n2)>n3?n1>n2?n1:n2:n3;
		 * 
		 * System.out.println("Largest "+lar);
		 */
		
		 int num;
		 System.out.println("enter number");
		 Scanner s = new Scanner(System.in);
		 num=s.nextInt();
		 System.out.println(reverse(num));
		
		
	}
	public static int reverse(int a) {
		int ans=0;
		int flag =0;
		if(a<0) {
			a=a*-1;
			flag=1;
		}
		
		
		while(a>0) {
			ans = ans*10+a%10;
			a=a/10;
		}
		if(flag==1) {
			ans = ans*-1;
		}
		
		return ans;
	}
}
