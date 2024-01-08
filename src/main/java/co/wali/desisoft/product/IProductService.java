package co.wali.desisoft.product;

import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface IProductService {
  public Product addProduct(Product product);
  public Product addProduct(List<Product> product);
  public void removeProduct(Product product);
  public void removeProduct(int productId);
  public Product searchItem(int productId);
  public Product searchItem(String productName);
  public Product searchItem(String productName, double price);
}
