
public class StringApp {

	public static void main(String[] args) {

	}
	// Class demos for talk subjects

	String message1 = "Hello";
	{
	}

		String message2 = "World!";
		message1 = public class StringApp {

	public static void mamessage1;
		String message3 = message1 + " " + message2;
	}
	String message = "Hello World!";
	{
         System.out.println(message1);
         for (int i = 0; i < message1.length(); i++); {
         System.out.println(message1.charAt(0));			 // all letter has a index
	
         int index = message1.indexOf("rld!");
         System.out.println(index);							// start wit index 8
       
         int index1 = message1.indexOf("$");
         if( index1 == -1) {
        	 System.out.println(index1);	
        	 
        	 int index1 = message1.indexOf("o");
        	 while ( index1 != -1) 
        		 System.out.println(index1);	
        		 index1 = message1.indexOf("o", index1 +1);
        		 System.out.println(index1);
        	 
        	 int index1 = message1.lastIndexOf("o");
        	 while ( index1 != -1)
        		 System.out.println(index1);	
        		 index1 = message1.lastIndexOf("o", index1 -1);
         System.out.println(index1);
        	
        	  String message = "    Hello World!     ";   // trimming out open spaces
        		 String messageTrimmed = message.trim();
        	     System.out.println(messageTrimmed);
        	     
        	//     int delimiter = message.indexOf(" ");
        	     String delimiter = " ";
        	     String hello = message.substring(0,5);
        	     String world = message.substring(6);
        	     System.out.println(hello);
        	     System.out.println(world);
        	     
        	      System.out.println(hello + world);
        	      
        	      String message1 = message1.replace(" ","-");
        	      System.out.println(message1);
        	      
        	     String[] helloworld = message1.split(delimiter);
        	     for (String word : helloworld) {
        	     for (int i = 0; i < helloworld.length; i++); 
        	     System.out.println(helloworld[index1]);
        	      
        	     StringBuilder sbMessage = new StringBuilder(message1);
        	     System.out.println(sbMessage);							
        	     
        	     System.out.println(sbMessage.capacity());
        	     System.out.println(sbMessage.length());
        	     
        	     sbMessage.append(message1);
        	     System.out.println(sbMessage);
        	     
        	     sbMessage.insert(5, '$'); 
        	     sbMessage.replace(7, 12, "Drakness my old friend");
        	     
        	     sbMessage.delete(5, 15);
        	     System.out.println(sbMessage);
        	     sbMessage.deleteCharAt(sbMessage.length() -1);
        	     sbMessage.deleteCharAt(sbMessage.length()-1);
        	     System.out.println(sbMessage);
        	     }

	private static String pad(String s, int length) {
		if (s.length() < length) {
			StringBuilder sb = new StringBuilder(s);
			while (sb.length() < length) {
				sb.append("*");
			}
			return sb.toString();
			{
		
			}
		} else {
			return s.substring(0, length);
		}

	}
}	
        	    	 
        	    	 
        	    	 
        	     
        	     
         

