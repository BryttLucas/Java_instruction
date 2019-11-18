package ch08_Inheritance_Demo;
public class DemoApp extends AnimalApp {
	private String blowHoleSize;

	public DemoApp(String name, int limbs, int age, String type,String blowHoleSize) {
		super(name, limbs, age, type);
		this.blowHoleSize=blowHoleSize;
	}

	public String getBlowHoleSize() {
		return blowHoleSize;
	}

	public void setBlowHoleSize(String blowHoleSize) {
		this.blowHoleSize = blowHoleSize;
	}
	
	public void swims() {
		System.out.println(name + " swims.");
	}

}
