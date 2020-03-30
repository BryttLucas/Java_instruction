package ch08_Inheritance_Demo;
public class DemoApp extends AnimalApp {
	private String blowHole;

	public DemoApp(String name, int limbs, int age, String type,String blowHole) {
		super(name, limbs, age, type);
		this.blowHole=blowHole;
	}

	public String getBlowHole) {
		return blowHole;
	}

	public void setBlowHole(String blowHole) {
		this.blowHole = blowHole;
	}
	
	public void swims() {
		System.out.println(name + " swims.");
	}

}
