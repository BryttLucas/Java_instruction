
public class LessonAircraftApp {

	public static void main(String[] args) {
		aircraft cessna172 = new aircraft();          // creates OBJECT
		
		aircraft piperSaratoga = new aircraft();
		
		cessna172.passengers =4;
		cessna172.cruiseSpeed = 140;
		cessna172.fuelCapacity = 56.5;
		cessna172.fuelBurnRate = 9.5;
		
		System.out.println("Cessna 172 passengers " + cessna172.passengers);
		System.out.println("Cessna 172 fuel burn Rate " + cessna172.fuelBurnRate + " gph");
		System.out.println("Cessna 172 fuel capacity " + cessna172.fuelCapacity + " gallons");
		System.out.println("Cessna 172 cruise speed " + cessna172.cruiseSpeed + " mph");
		
		piperSaratoga.passengers = 6;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;
		
		System.out.println("Piper Saratoga cruise speed " + piperSaratoga.cruiseSpeed + " mph");
		System.out.println("Piper Saratoga fuel capacity " + piperSaratoga.fuelCapacity + " gallons");
		System.out.println("Piper Saratoga passanger capacity " + piperSaratoga.passengers);
		System.out.println("Piper Saratoga fuel burn rate is" + piperSaratoga.fuelBurnRate + " gph");
	}	
}
    class aircraft {
	    int passengers;                  // number of people
	    int cruiseSpeed;                // miles per hour
	    double fuelCapacity;            // gallon
	    double fuelBurnRate;            // gallon per hour
	    
	    
  }
    

