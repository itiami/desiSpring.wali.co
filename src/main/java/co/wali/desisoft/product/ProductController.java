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

    @GetMapping(path = "")
    public List<Product> getElectronicProductData(){
        System.out.println(productServiceImp.getAllProducts());
        System.out.println(iProduct.getAllProducts());
        return iProduct.getAllProducts();
    }


    @GetMapping("/id/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productServiceImp.getProductById(id);
    }


    @GetMapping("/p/{pId}")
    @ResponseBody
    public String getEmployeesById(@PathVariable String pId) {
        return "ID: " + pId;
    }

    @GetMapping("/{name}")
    @ResponseBody
    public Product getProductByName(@PathVariable String name) {
        Product product = productServiceImp.searchProduct(name);
            return product;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productServiceImp.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productServiceImp.deleteProduct(id);
    }



}
