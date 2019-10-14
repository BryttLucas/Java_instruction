package ui;

import java.util.ArrayList;
import java.util.List;

import business.Product;
import util.Console;

public class ProductApp {
	  private static List<Product> products  = new ArrayList<>();

	  public static void main(String[] args) {
		System.out.println("Welcome to the Product App");
		products.add(new Product("java","Murach's", "Java", 57.50));
		products.add(new Product("c#","Murach's", "C#", 59.50));
		
		
		// list product
		printList(products);
		
		// add products
		String code = Console.getString("code?:");
		String desc = Console.getString("Description?:");
		double price = Console.getString("code?:");
		
		Product p = new Product(code, desc, price?; )
		products.add(p);
		printList(products);
		
		//search for products
		System.out.println("Search for a product");
		String c = Console.getString("Code?");
		p = getProduct(c);
		System.out.println(p);
		
		
		
		
		
		
		System.out.println("Bye");

	}
	private static Product getProduct( String code) {
	    Product p = null;
	  // search the list for the right product
	    for (Product prod: products) {
	    	if (prod.getCode().equalsIgnoreCase(code)) {
	             p = prod;
	    }
	    return p;
	    }
		
		
	
     private static void  printList(List<Product>list);
     System.out.println(p);
}

}