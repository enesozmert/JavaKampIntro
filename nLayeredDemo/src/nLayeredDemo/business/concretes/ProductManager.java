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
		//I� kodlar� yaz�l�r.
		if (product.getCategoryId()==1) {
			System.out.println("Bu kategoriye �r�n eklenemiyor. "+product.getCategoryId());
			return;
		}
		productDaou.add(product);
		this.loggerService.logToSystem("�r�n eklendi "+product.getName());
	}

	@Override
	public List<Product> getAll(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
