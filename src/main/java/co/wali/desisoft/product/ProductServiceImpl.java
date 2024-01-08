package co.wali.desisoft.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements IProduct {
    Product product = new Product();
    public ProductServiceImpl(){

    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product addProduct(List<Product> product) {
        return null;
    }

    @Override
    public void removeProduct(Product product) {

    }

    @Override
    public void removeProduct(int productId) {

    }

    @Override
    public Product searchProduct(int productId) {
        return null;
    }

    @Override
    public Product searchProduct(String productName) {
        for (Product product : getAllProducts()){
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product searchProduct(String productName, double price) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(Arrays.asList(
                new Product(101L,"SSD",120),
                new Product(102L ,"Keyboard",40),
                new Product(103L ,"Mouse",54)
        ));
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

}
