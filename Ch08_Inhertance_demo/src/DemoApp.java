
public class DemoApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome!");
		
		Aminal dolphin1 = new Dolphin("Bob",3,25,"mammal,""ajustable")
	    System.out.println(dolphin1.getName());
	    System.out.println(dolphin1.getLimbs());
	    System.out.println(dolphin1.getAge());
    	 System.out.println(dolphin1.getType());
		 System.out.println((Dolphin)dolphin1.getBlowholeSize()); 
		 dolphin1.eat();
		 dolphin1.sleep();
		((Dolphin)dolphin1.swin)();
		  
	}
}
