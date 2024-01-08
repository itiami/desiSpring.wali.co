package co.wali.desisoft.payment;

import co.wali.desisoft.product.Product;

public class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing payment of amount: " + amount);
    }

    // Overloaded method
    public void processPayment(Product product) {
        System.out.println("Processing payment for product: " + product.getName());
    }
}
