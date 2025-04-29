package org.example;

public class Product
{
    private String name;
    private double price;
    private String image;

    /**
     * Constructs a new org.example.Product with the given name, price, and image.
     *
     * @param name  the name of the product
     * @param price the price of the product
     * @param image the image filename or path for the product
     */
    public Product(String name, double price, String image)
    {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    /**
     * Getters for Product attributes
     */
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    /**
     * Returns a string representation of the product for display.
     *
     * @return a string describing the product
     */
    @Override
    public String toString()
    {
        return name + " - $" + price + " (" + image + ")";
    }
}
