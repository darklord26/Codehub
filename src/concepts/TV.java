package concepts;

public class TV {

	public int size;
	public String brand;

	public TV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String toString() {
		return "BrandName :" + this.brand + " " + "Size :" + this.size;
	}
}
