
public class CodeLooping {

	public static void main(String[] args) {
		System.out.println("10,000 at 2% interest = " + calcuateInterest(10000.0, 2.0));
		System.out.println("10,000 at 3% interest = " + calcuateInterest(10000.0, 3.0));
	    System.out.println("10,000 at 4% interest = " + calcuateInterest(10000.0, 4.0));
	    System.out.println("10,000 at 5% interest = " + calcuateInterest(10000.0, 5.0));
	  
	    for(int i=1; i<5; i++) {
	        System.out.println("Loop "+ i + " Hello!");
	    }      
	     for (int i=2; i<9; i++) {
	    	 System.out.println("10,000 at" + i + "% interest = " + String.format("%.2f", calcuateInterest(10000.0, i))); 
	     }
	     for (int i=8; i>1; i--) {
	    	 System.out.println("10,000 at" + i + "% interest = " + String.format("%.2f", calcuateInterest(10000.0, i)));
	     }

	int count = 0;
	for(int i=10; i<50; i++) {
		if(isPrime(i)) {
			count++;
			System.out.println("Number " + i + " is a prime number?");
			if(count == 3) {
				System.out.println("Exiting for loop.");
				break;
			}
		}
	}
		
	}
      public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for(int i=2; i<=(long)Math.sqrt(n); i++) {
			if(n % i==0 ) {
				return false;
			}
		}
		return true;
		}
	public static double calcuateInterest(double amount, double interestRate) {
		return(amount *(interestRate / 100));
	}
}
