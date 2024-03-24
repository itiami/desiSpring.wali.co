package co.wali.desisoft.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements IProduct{

    // this @Autowired approach in class property is called Field injection  and is not recommended
//    @Autowired
//    private  IProductRepository productRepository;

    private  final IProductRepository productRepository;

    // this @Autowired approach in class class constructor is called constructor injection  and is OK.. here
    // in case of only one as below the @Autowired annotation is not required. but in multiple it's required..
    @Autowired
    public ProductServiceImpl( IProductRepository productRepository){
        this.productRepository = productRepository;
    }


/*    // this @Autowired approach in class setter is called setter injection  and is OK.. here also..
    @Autowired
    public void setProductRepository( IProductRepository productRepository){
        this.productRepository = productRepository;
    }*/


    @Override
    public Product addProduct(Product product) {
        this.productRepository.save(product);
        return product;
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
        ArrayList<Product> arrayList =  new ArrayList<>(Arrays.asList(
                new Product(101L,"SSD",120),
                new Product(102L ,"Keyboard",40),
                new Product(103L ,"Mouse",54)
        ));
        System.out.println(arrayList);
        //return arrayList;
        return this.productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public Product getProductByName(String name) {
        return null;
    }


    @Override
    public void deleteProduct(Long id) {

    }


}


