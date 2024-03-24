package co.wali.desisoft.product;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.json.JSONObject;

//@Transactional
@Entity
@Table(name = "ds_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private double price;

    public Product(){}

    public Product(Long id ,String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", name);
        jsonObject.put("price", price);
        return jsonObject.toString();
    }
}
