package co.wali.desisoft.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "product")
public class ProductController {
    private final ElectronicProduct electronicProduct = new ElectronicProduct();
    private final ProductServiceImpl productService = new ProductServiceImpl();

    //@Autowired
    //private IProductService iProductService;




    private ProductController(){}

    @GetMapping(path = "electronicProduct")
    public String getElectronicProductData(){
        //productService.addProduct();
        System.out.println(electronicProduct.getName());
        return electronicProduct.getName();
    }
}
