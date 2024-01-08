package co.wali.desisoft.product;

import java.util.List;

public interface IProduct {
  public Product addProduct(Product product);
  public Product addProduct(List<Product> product);
  public void removeProduct(Product product);
  public void removeProduct(int productId);
  public Product searchProduct(int productId);
  public Product searchProduct(String productName);
  public Product searchProduct(String productName, double price);

  List<Product> getAllProducts();
  Product getProductById(Long id);
  Product saveProduct(Product product);
  void deleteProduct(Long id);

}
