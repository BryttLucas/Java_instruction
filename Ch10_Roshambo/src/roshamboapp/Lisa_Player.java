import java.util.Random;

public class Lisa extends Player {

	public Lisa() {
		this.setName("Lisa");
		this.generateRoshambo();

	}

	@Override
	public void generateRoshambo() {
		Random rand = new Random(System.currentTimeMillis());
		int value = rand.nextInt(2);
		switch(value) {
		case 0:
			setRoshamboValue(Roshambo.ROCK);
		case 1:
			setRoshamboValue(Roshambo.PAPER);
		case 2:
			setRoshamboValue(Roshambo.SCISSORS);
		}
		


	}

}
