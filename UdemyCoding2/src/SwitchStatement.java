
public class SwitchStatement {

	public static void main(String[] args) {
		int value = 3;
		if(value == 1) {
			System.out.println("Value was 1");
		}else if(value == 2) {
		    System.out.println("Value was 2");			
		}else {
			System.out.println("Value not 1 or 2");
		}
		int switchValue = 1;
		
		switch(switchValue) {
		case 1:
		    System.out.println("value was 1");
		    break;
		case 2:
			System.out.println("Value was 2");
			break;
		default: 
			System.out.println("Value not 1 or 2");
			break;
		
		}
       char charValue = 'b';
		
		switch(charValue) {
		case 'a':
		    System.out.println("Value was a");
		    break;
		case 'b':
			System.out.println("Value was b");
			break;
		case 'c':
			System.out.println("Value was c");
			break;
		case 'd':
			System.out.println("Value was d");
			break;
		case 'e':
			System.out.println("Value was e");
			break;
		default: 
			System.out.println("Value not found");
			break;
	}
}
}