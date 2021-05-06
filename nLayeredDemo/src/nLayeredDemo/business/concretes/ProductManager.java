package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDaou;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDaou, LoggerService loggerService) {
		super();
		this.productDaou = productDaou;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		//Iþ kodlarý yazýlýr.
		if (product.getCategoryId()==1) {
			System.out.println("Bu kategoriye ürün eklenemiyor. "+product.getCategoryId());
			return;
		}
		productDaou.add(product);
		this.loggerService.logToSystem("Ürün eklendi "+product.getName());
	}

	@Override
	public List<Product> getAll(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
