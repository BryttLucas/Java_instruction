
import java.util.ArrayList;

public class WizardInventoryApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the Wizard Inventory Game!\n");
	 
		System.out.println("Command Menu");	
		
		System.out.println("show -Show all item\n"+"grab - Grab an item\n"+ "New - Add item\n" +
		"edit - Edit an item\n"+"drop - Drop an item\n"+"exit - Exit Program");
		System.out.println();
		
	       Console console = new Console();
	       String choice = "";
	       
	       ArrayList<String> inventory = new ArrayList<String>();
	       inventory.add("wooden Staff");
	       inventory.add("wizard hat");
	       inventory.add("cloth shoes");
	      
	       while(!choice.equalsIgnoreCase("exit")) {
	           choice = console.getString("Command:  ");
	       
	       switch(choice ) {
	           case "show": show(inventory);
	                continue;
	                
	           case "grab":
	    	   if (inventory.size()>= 4) {
	    		   System.out.println("Inventory is full.");
	    		   continue;
	    	   }
	           case "New Item":
	    	     String newItem =console.getString("Name:");
	    	     inventory.add(newItem);
	    	        continue;
	    	        
	           case "edit":  
	    	      int itemNum = console.getInt("Item number: ", 0, inventory.size() +1);
	    	      String newName = console.getString("New name:");
	    	      inventory.set(itemNum -1, newName);
	    	        continue;
	    	        
	           case "drop":
	        	  int itemNum2 = console.getInt("Item number:",0, inventory.size() +1);
	        	  System.out.println(inventory.get(itemNum2 -1) + " was Drop.");
	        	  inventory.remove(itemNum2 -1);
	        	  	continue;
	        	  	
	        	case "Exit":
	        	  	System.out.println("Goodbye.");
	        	  	break;
	        	  	
	          default:
	    	   System.out.println("You must make a selection from the menu");
	    	   continue;
	       }
	   }
}
	private static void show(ArrayList<String>inventory)  {
		for (int i = 0; i < inventory.size(); i++) {
			System.out.println((i + 1 +")" + inventory.get(i)));
		}
	}
}
	
     	 


	
	
	


