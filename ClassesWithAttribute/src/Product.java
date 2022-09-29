public class Product {
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.err.println("Yapıcı Blok Çalıştı.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}

	public Product() {

	}

//	attribute | field == nitelik
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	String kod;

//	getter
//	setter
//	this bu class'ta demektir.

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id; // ismin ilk harfi+id yi almak için bu kodu yazarız.
	}

}
