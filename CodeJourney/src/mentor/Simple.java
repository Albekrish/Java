package mentor;

public class Simple {
	private String fruit;
	private String size;
	private String color;
	
	
	public Simple(String fruit, String size, String color) {
		super();
		this.fruit = fruit;
		this.size = size;
		this.color = color;
	}
	
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
