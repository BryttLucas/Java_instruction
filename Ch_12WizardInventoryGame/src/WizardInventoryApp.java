import java.util.ArrayList;
import java.util.List;

public class WizardInventoryApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome to the Wizard Inventory Game!\n");
	 
		System.out.println("Command Menu");	
	
	    String[]  command  = new String [5]; 
	    command[0] = "show - Show all item";
	    command[1] = "grab - Grab an item";
	    command[2] = "edit - Edit an item";
	    command[3] = "drop - Drop an item";
	    command[4] = "exit - Exit Program\n";
	    for (String c : command) 
	    	System.out.println(c);
	
	    System.out.println("Command: show\n"); 
	  	 List<String> show = new ArrayList<>();  {
    		show.add(1 +(" wooden Staff"));
    		show.add(2 +(" wizard hat"));
    		show.add(3 + (" cloth shoes"));
    	     for(String s : show) {
	        System.out.println(s);
    	     }
	
		}
	  	 }
	  	 
	  	 
	}
	
	


