package co.wali.desisoft.product;

import java.util.Objects;

public class ElectronicProduct extends Product {
    private  String warrantyPeriod;

    /*public ElectronicProduct(){};
    public ElectronicProduct(String name, double price, String warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }*/

    @Override
    public void setName(String name) {
        super.setName("HDD");
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(Objects.requireNonNullElse(100.00, price));
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
