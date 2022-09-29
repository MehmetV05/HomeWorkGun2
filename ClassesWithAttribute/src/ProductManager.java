
public class ProductManager {

	public void Add(Product product) {
		System.out.println("Ürün eklendi:" + product.getName());
		System.out.println("Ürün eklendi:" + product.getId());
		System.out.println("Ürün eklendi:" + product.getDescription());
		System.out.println("Ürün eklendi:" + product.getPrice());
		System.out.println("Ürün eklendi:" + product.getStockAmount());
	}
}
