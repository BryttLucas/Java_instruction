import java.util.Scanner;

public class ConsoleIO implements UserIO {

	         Scanner sc = new Scanner(System.in);
	
	public ConsoleIO() {
		System.out.println("Int Test");
	}

	@Override
	public int getInt(String prompt) {
		System.out.println("Enter an interger between -100 and 100:");
		return 0;
	}

	@Override
	public double getDouble(String prompt) {
	    System.out.println("Enter a double between -100 and 100:");
		return 0;
	}

	@Override
	public String getString(String prompt) {
		System.out.println("Enter your email address:");
		return null;
	}

	@Override
	public void print(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void println() {
		// TODO Auto-generated method stub

	}

	@Override
	public void println(String s) {
		// TODO Auto-generated method stub

	}

}
