package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Lenovo v15", 15000, "16GB Ram");

		Product product2 = new Product();
		product2.name = "Lenovo v16";
		product2.id = 2;
		product2.detail = "32 GB Ram";
		product2.unitPrice = 16000;

		Product product3 = new Product();
		product3.name = "Hp V5";
		product3.id = 3;

		product3.detail = "16 Gb Ram";
		product3.unitPrice = 10000;

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.name + " " + product.detail);
		}

		System.out.println(product1.name);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Bahce/Mobilya";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}

}
