package roshamboapp;
public class Lisa extends Player {

	@Override
	public void generateRoshambo() {
		int n = (int)(Math.random() * 2+1);
		if (n == 0) {
			this.setRoshvalue(Roshambo.rock);
		} else if (n == 1) {
			this.setRoshvalue(Roshambo.paper);
		} else {
			this.setRoshvalue(Roshambo.scissors);
		}
	}

}