
public class WhileDoWhileLoop {

	 public static void main(String[] args) {
		int number = 4;
		int finishNumber = 20;

		while (number <= finishNumber) {
			number++;
			if (!isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even number " + number);
		}
		int count = 6;
		count = 6;
		do {
			System.out.println("Count value was " + count);
			count++;
			if (count > 100) {
				break;
			}
		} while (count != 6);
	}

	static boolean isEvenNumber(int number) {
		if ((number % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	int number1 = 4;
	int finishNumber = 20;
	int evenNumberFound = 0;
	{

		while (number1 <= finishNumber) {
			number1++;
			if (!isEvenNumber(number1)) {
				continue;
			}
			System.out.println("Even number " + number1);
			evenNumberFound++;
			if (evenNumberFound >= 5) {
				break;
			}

		}
		System.out.println("Total eve number found = " + evenNumberFound);

		int count1 = 1;
		while (count1 != 6) {
			System.out.println("Count value is " + count1);
			count1++;
		}
		int count = 1;
		while (true) {
			if (count1 == 6) {
				break;
			}
			System.out.println("Count value is " + count1);
			count1++;
		}

		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				count1++;
				sum += i;
				System.out.println("Found number =" + i);
			}
			if (count1 == 5) {
				break;
			}
		}
		System.out.println("Sum =" + sum);

	}
}
