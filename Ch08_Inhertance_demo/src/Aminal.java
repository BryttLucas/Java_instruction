
public abstract class Aminal {
      
	protected String name;
	private int limbs;
	private int age;
	private String type;
	
	public Aminal(String name, int limbs, int age, String type);
	  this.name = name;
	  this.limbs = limbs;
	  this.age = age;
	  this.type = type;
	  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLimbs() {
		return limbs;
	}

	public void setLimbs(int limbs) {
		this.limbs = limbs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

			  
	
}