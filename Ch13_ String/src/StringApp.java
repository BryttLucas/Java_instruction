
public class StringApp {

	public static void main(String[] args) {
		
	}
		// Class demos for talk subjects
	
	
		String message = "Hello";{
		String message2 = "World!";
		message = message;
		String message3 = message +" "+message2;
	}	
         String message = "Hello World!"; {
         System.out.println(message);
         for (int i = 0; i < message.length(); i++); {
         System.out.println(message.charAt(0));			 // all letter has a index
	
         int index = message.indexOf("rld!");
         System.out.println(index);							// start wit index 8
       
         int index = message.indexOf("$");
         if( index == -1) {
        	 System.out.println(index);	
        	 
        	 int index = message.indexOf("o");
        	 while ( index != -1) 
        		 System.out.println(index);	
        		 index = message.indexOf("o", index +1);
        		 System.out.println(index);
        	 
        	 int index = message.lastIndexOf("o");
        	 while ( index != -1)
        		 System.out.println(index);	
        		 index = message.lastIndexOf("o", index -1);
         System.out.println(index);
        	
        	  String message = "    Hello World!     ";   // trimming out open spaces
        		 String messageTrimmed = message.trim();
        	     System.out.println(message.trimmed);
        	     
        	//     int delimiter = message.indexOf(" ");
        	     String delimiter = " ";
        	     String world = message.substring(0,5);
        	     String world = message.substring(6);
        	     System.out.println(hello);
        	     System.out.println(world);
        	     
        	      System.out.println(hello + world);
        	      
        	      String message2 = message.replace(" ","-");
        	      System.out.println(message2);
        	      
        	     String[] helloworld = message.split(delimiter);
        	     for (String word : helloWorld) {
        	     for (int i = 0; i < helloworld.length; i++); 
        	     System.out.println(helloworld[i]);
        	      
        	     StringBuilder sbMessage = new StringBuilder(message);
        	     System.out.println(sbMessage);							
        	     
        	     System.out.println(sbMessage.capacity());
        	     System.out.println(sbMessage.length());
        	     
        	     sbMessage.append(message);
        	     System.out.println(sbMessage);
        	     
        	     sbMessage.insert(5, '$'); 
        	     sbMessage.replace(7, 12, "Drakness my old friend");
        	     
        	     sbMessage.delete(5, 15);
        	     System.out.println(sbMessage);
        	     sbMessage.deleteCharAt(sbMessage.length() -1);
        	     sbMessage.setCharAt(sbMessage.length()-1 '*');
        	     System.out.println(sbMessage);
        	     
        	     System.out.println(paddedMessage);
        	     }     
        	     
        	     private static String pad(String s, int length) {
        	    	 if(s.length() < length) {
        	    		 StringBuilder sb = new StringBuilder(s);
        	    		 while (sb.length() < length) {
              	    			 sb.append("*");
        	    		 }	 
        	    	 return sb.toString();{
        	    	 } else {
        	    		 return s.substring(0, length);
        	    	 }
        	    	 }
        	    	 
        	    	 
        	    	 
        	     
        	     
         

