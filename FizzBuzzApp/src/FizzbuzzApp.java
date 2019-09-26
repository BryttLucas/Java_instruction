

public class FizzbuzzApp {

	public static void main(String[] args) {
          
          System.out.println( "Weclome to Fizz Bizz Game");
        
       
         for (int i = 1; i <= 25; i++) {
        	 if((i % 3 ==0) && (i % 5==0)) {
        		 System.out.println(i+"-fizzbuzz");
        	 }
        	 else if (i % 3==0) {
        		 System.out.print(i+"-fizz");
        	 }
        	 else if (i % 5==0)  {
                   System.out.print(i+"-bizz");
        	 }
            	    System.out.println(i);
            	
             }
        System.out.println("Goodbye");
       
            
	}
}
