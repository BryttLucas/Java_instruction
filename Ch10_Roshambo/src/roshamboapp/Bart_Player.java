public class Bart extends Player {

	public Bart() {
		this.setName("Bart");
		this.generateRoshambo();

	}

	@Override
	public void generateRoshambo() {
		setRoshamboValue(Roshambo.ROCK);
	}

}