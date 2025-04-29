package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart
{
    private List<Product> products;

    public Cart()
    {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product)
    {
        this.products.add(product);
    }

    public void removeProduct(Product product)
    {
        this.products.remove(product);
    }

    public void removeAllProducts()
    {
        this.products.clear();
    }

    public double calculateSubtotal()
    {
        double subtotal = 0;
        for (Product product : products)
        {
            subtotal += product.getPrice();
        }
        return subtotal;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public void removeMultipleProducts(List<Product> productsToRemove)
    {
        this.products.removeAll(productsToRemove);
    }
}