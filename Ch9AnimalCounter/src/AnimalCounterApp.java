
public class AnimalCounterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Animal Counter App!");
		 System.out.println("Counting alligator: \n");
	     Alligator alligator = new Alligator();
	     CountUtil.count(alligator, 3);
	     System.out.println();
	     
	     System.out.println("Counting sheep:\n");
	     Sheep blackie = new Sheep("Blackie");
	     CountUtil.count(blackie, 2);
	     System.out.println();
	     
	     Sheep dolly = (Sheep) blackie.clone();
	     dolly.setName("Dolly");
	     CountUtil.count(dolly, 3);
	     System.out.println();
	     
	     blackie.resetCount();
	     CountUtil.count(blackie, 1);
	     
		
		
       
	}
  }

	
