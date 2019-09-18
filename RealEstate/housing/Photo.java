package housing;

public class Photo {
	protected String name, type;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}
	
	protected Photo(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	protected Photo() {
		super();
	}

	@Override
	public String toString() {
		return "Photo [name=" + name + ", type=" + type + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
}
