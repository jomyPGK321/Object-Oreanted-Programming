package csae_studys;

import java.util.Scanner;

public class Series_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;int b=0;
		if (n % 2 == 0)  
	    { 
	        n = n / 2; 
	        n = 2 * (n - 1); 
	        System.out.println(n / 2); 
	    } 
	      
	    // If n is odd 
	    else 
	    { 
	        n = (n / 2) + 1; 
	        n = 2 * (n - 1); 
	        System.out.println(n); 
	    } 
	} 
	  
	// Driver code 
	public static void main1(String args[]) 
	{ 
	    int X = 10; 
	    System.out.println(X); 
	      
	    X = 7; 
	    System.out.println(X); 
	} 
	}


