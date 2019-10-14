
public class Lesson2 {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 7;
		
		int answer1;
		int answer2;
		boolean answer3;
		
		int answer;
		answer = multNumbers(num1);
		System.out.println(" The result is " + answer);
		
		answer1 = multNumbers(num1);
	    System.out.println(" When we add num1 and num2, we get:" + answer1);
			     
		answer2 = addNumber(num1, num2);
	    System.out.println(" When we add num1 and num2, we get:" + answer2);
	     
	    answer3 = equalNumbers(num1, num2);
	    System.out.println("num1 and num2 are equal " + answer3);
	}
        public static int multNumbers(int a) {
    	    int ans = a * 7;   // return (a*7);
    	    return ans;
    }
         public static int addNumber(int x, int y) {
           	int ans = x + y;    // return answer = x + y;
           	return ans;
    
    }
          public static boolean equalNumbers(int r, int t) {
            if (r == t) return true;
    	    else return false;		
    	
    }
}
