package co.wali.desisoft.product;

import org.json.JSONObject;

public class Product {
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
