package org.example;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CheckoutController {

    private Cart cart = new Cart(); // Store cart globally for the session
    private ShippingInfo shippingInfo;
    private PaymentInfo paymentInfo;
    private Order order;

    @GetMapping("/cart")
    public String viewCart(Model model)
    {
        model.addAttribute("cart", cart.getProducts());
        model.addAttribute("subtotal", cart.calculateSubtotal());
        return "cart";
    }

    @PostMapping("/cart/remove")
    public String removeItem(@RequestParam("productName") String productName, Model model)
    {
        // Logic to remove the selected item
        for (Product product : cart.getProducts())
        {
            if (product.getName().equals(productName))
            {
                cart.removeProduct(product);
                break;
            }
        }
        return "redirect:/cart";
    }

    @GetMapping("/shipping")
    public String viewShippingInfo()
    {
        return "shipping";
    }

    @PostMapping("/shipping")
    public String submitShippingInfo(@RequestParam("firstName") String firstName,
                                     @RequestParam("lastName") String lastName,
                                     @RequestParam("street") String street,
                                     @RequestParam("city") String city,
                                     @RequestParam("state") String state,
                                     @RequestParam("postalCode") String postalCode,
                                     @RequestParam("phoneNumber") String phoneNumber) {
        shippingInfo = new ShippingInfo(firstName, lastName, street, city, state, postalCode, phoneNumber);
        return "redirect:/payment";
    }

    @GetMapping("/payment")
    public String viewPaymentInfo()
    {
        return "payment";
    }

    @PostMapping("/payment")
    public String submitPaymentInfo(@RequestParam("cardNumber") String cardNumber,
                                    @RequestParam("expirationDate") String expirationDate,
                                    @RequestParam("cvv") String cvv) {
        paymentInfo = new PaymentInfo(cardNumber, expirationDate, cvv);
        return "redirect:/confirm";
    }

    @GetMapping("/confirm")
    public String viewConfirmOrder(Model model)
    {
        // Assuming shipping cost is fixed at $5.00
        order = new Order(cart, shippingInfo, paymentInfo, 5.00);
        model.addAttribute("order", order);
        return "confirm";
    }

    @PostMapping("/completeOrder")
    public String completeOrder(Model model)
    {
        order.printReceipt();
        return "redirect:/receipt";
    }

    @GetMapping("/receipt")
    public String viewReceipt(Model model)
    {
        model.addAttribute("order", order);
        return "receipt";
    }
}