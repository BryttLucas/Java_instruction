package roshamboapp;

public class Player1Class {
	package roshamboapp;

	public class Player1 extends Player
	{
	public Player1(){
	super();
	}
	  
	public Roshambo generateRoshambo()
	{
	return Roshambo.ROCK;
	}
	public abstract class Player
	{
	  
	public String name;
	public String response;

	public Player() {}
	  
	public void setName(String name)
	{
	this.name = name;
	}
	  
	public String getName()
	{
	return name;
	}
	  
	public void setResponse(String response)
	{
	this.response = response;
	}
	  
	public String getResponse()
	{
	return response;
	}
	  
	public abstract Roshambo generateRoshambo();
	}
  }
}