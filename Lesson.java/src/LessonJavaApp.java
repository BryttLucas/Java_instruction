
public class LessonJavaApp {

	public static void main(String[] args) {
		System.out.println("Program start. \n");
		printFirstName();
		printLastName();
		addName();
        System.out.println("Program end.");
	}

	public static void printFirstName() {
	 System.out.println ("Welcome to lesson");	 
    }
	public static void printLastName() {
	 System.out.println("My last name is Lucas.");
	}	 

public static void addName() {
	int Brytt =5;
	int Lucas =5;
	int sum;
	
	sum = Brytt + Lucas;
	
	System.out.println("The number of letter in you name is " + sum);
	
}	
}