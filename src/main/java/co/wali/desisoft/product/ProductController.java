package co.wali.desisoft.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "product")
public class ProductController {
    private final IProduct iProduct;
    @Autowired
    private ProductServiceImpl productServiceImp;

    public ProductController(IProduct iProduct) {
        this.iProduct = iProduct;
    }

    @GetMapping
    public List<Product> getElectronicProductData(){
        System.out.println(productServiceImp.getAllProducts());
        System.out.println(iProduct.getAllProducts());
        return iProduct.getAllProducts();
    }

    // http://192.168.1.235:3010/product/id/101
    @GetMapping("/id/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productServiceImp.getProductById(id);
    }

    // http://192.168.1.235:3010/product/keyboard
    @GetMapping("{name}")
    public Product getProductByName(@PathVariable String name) {
        return productServiceImp.searchProduct(name);
    }


    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productServiceImp.addProduct(product);
    }

    // http://192.168.1.235:3010/product/101
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productServiceImp.deleteProduct(id);
    }



}

