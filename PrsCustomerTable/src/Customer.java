import javax.annotation.Generated;


public class Customer {
	
	
	
	private int id;
	lenght = 30, nullable = false;
	private String name;
	decimal = 10,2 , nullable= false
	private double sale;
	private boolean active;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", sale=" + sale + ", active=" + active + "]";
	}
	
	
}
