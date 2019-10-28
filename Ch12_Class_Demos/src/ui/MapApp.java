import java.util.HashMap;
import java.util.Map;

import business.Product;

public class MapApp {

	public static void main(String[] args) {
		// create a map of products
		Map<String, Product> products = new HashMap<>();
		Product p1 = new Product (" java", "Murach J"," 57.50");
		Product p2 = new Product (" c#", "Murach J"," 59.50");
		Product p3 = new Product (" andr", "Murach J"," 58.50");
		
		products.put(p1 getCode(),p1);
		products.put(p2 getCode(),p2);
		products.put(p3 getCode(),p3);
		
		for(Map.Entry<String, Product> prod: products.entrySet));
	      System.out.println(prod.getKey()+" :" +prod.getValue());
	      System.out.println(products.get("c#"));
	      System.out.println(Product.containsKey("java"));
	      System.out.println(Product.containsKey("Java"));
	}

}
