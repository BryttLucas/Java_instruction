import javax.script.Compilable;

public class Sheep implements Compilable, Cloneable {
	
	private String name;
	private int count;
	
	public Sheep (String name) {	
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;	
	}
	@Override
	protected Object clone() {
		return new Sheep (name);
		}
	public void incrementCount() {
		count++;
	}
}
