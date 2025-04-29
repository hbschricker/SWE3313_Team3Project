package org.example;

public class Order
{
    private Cart cart;
    private ShippingInformation shippingInfo;
    private PaymentInformation paymentInfo;
    private double shippingCost;

    public Order(Cart cart, ShippingInformation shippingInfo, PaymentInformation paymentInfo, double shippingCost)
    {
        this.cart = cart;
        this.shippingInfo = shippingInfo;
        this.paymentInfo = paymentInfo;
        this.shippingCost = shippingCost;
    }

    public double calculateTax()
    {
        return cart.calculateSubtotal() * 0.06; // 6% tax
    }

    public double calculateGrandTotal()
    {
        return cart.calculateSubtotal() + calculateTax() + shippingCost;
    }

    public void printOrderSummary()
    {
        System.out.println("org.example.Order Summary:");
        for (Product product : cart.getProducts())
        {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        System.out.println("Subtotal: $" + cart.calculateSubtotal());
        System.out.println("Tax (6%): $" + calculateTax());
        System.out.println("Shipping: $" + shippingCost);
        System.out.println("Grand Total: $" + calculateGrandTotal());
    }

    public void printReceipt()
    {
        printOrderSummary();
        System.out.println("Shipping Address: \n" + shippingInfo.toString());
        System.out.println("Payment Info: " + paymentInfo.toString());
    }
}