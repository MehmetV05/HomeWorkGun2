
public class Main {

	public static void main(String[] args) {
		Product product = new Product(1987654321, "Laptop", "Asus Laptop", 5000, 33);
//		Product product= new Product();
//		product.setName("Laptop");
//		product.setId(1987654321);
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(33);
//		product.getKod();		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
