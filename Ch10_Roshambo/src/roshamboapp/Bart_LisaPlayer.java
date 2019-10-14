package roshamboapp;

import java.util.Random;

import roshamboapp.Player1Class.Player1.Player;

public class Bart_LisaPlayer {

	public class Bart extends Player
	{
	public Bart() {
	{
	name = "Bart";
	}
	@Override
	public Roshambo generateRoshambo()
	{   
	return Roshambo.ROCK;
	}
	}
	public class Lisa extends Player
	{
	public Lisa() {
	{
	name = "Lisa";
	}
	@Override
	public Roshambo generateRoshambo()
	{  
	Random r=new Random();
	int ch=r.nextInt(3);
	if(ch==0) return Roshambo.ROCK;
	else if(ch==1) return Roshambo.PAPER;
	else return Roshambo.SCISSORS;
	}
	}
}