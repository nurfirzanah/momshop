

public class product {

	private int id, qty;
	private String name, desc, size;
	double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public product(int id, int qty, String name, String desc, String size, double price) {
		super();
		this.id = id;
		this.qty = qty;
		this.name = name;
		this.desc = desc;
		this.size = size;
		this.price = price;
	}

	
	
}
