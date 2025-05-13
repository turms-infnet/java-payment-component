package dev.tiagosilva.service;

public class PaymentService {
    public void processPayment(String paymentMethod) {
        // Process the payment using the specified payment method
        System.out.println("Processing payment using " + paymentMethod);
    }

    public void refundPayment(String paymentMethod) {
        // Refund the payment using the specified payment method
        System.out.println("Refunding payment using " + paymentMethod);
    }
}
