package housing;

public class House {
	protected int id;
	protected float price;
	protected String location, advertiser;
	protected Photo image;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAdvertiser() {
		return advertiser;
	}
	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}
	public Photo getImage() {
		return image;
	}
	public void setImage(Photo image) {
		this.image = image;
	}
	protected House(int id, float price, String location, String advertiser, Photo image) {
		super();
		this.id = id;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.image = image;
	}
	protected House() {
		super();
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", price=" + price + ", location=" + location + ", advertiser=" + advertiser
				+ ", image=" + image + "]";
	}

}
