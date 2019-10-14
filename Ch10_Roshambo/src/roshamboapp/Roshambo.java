package roshamboapp;

		public enum Roshambo

		{
		ROCK,
		PAPER,
		SCISSORS;
		  
		@Override
		public String toString()
		{
		String s = "";
		if (this.ordinal()==0)
		s = "Rock";
		else if (this.ordinal()==1)
		s = "Paper";
		else if (this.ordinal()==2)
		s = "Scissors";
		return s;   
		}
	}


