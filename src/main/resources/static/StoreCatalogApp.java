import java.util.ArrayList;

/**
 * The main application class for the store.
 * Initializes the product catalog and displays products to the user.
 */
public class storeApplication
{
    /**
     * Entry point for the store application. Initializes and displays products.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<Product> catalog = createProductCatalog();
        displayProductCatalog(catalog);
    }

    /**
     * Displays a welcome message to the user.
     * 
     */
    private void displayWelcomeMessage()
    {
         System.out.println("Welcome to the Jewelry Store!");
    }

    /**
     * Creates and returns a list of  products for the catalog.
     *
     * @return a list of Product objects
     */
    private static ArrayList<Product> createProductCatalog()
    {
        ArrayList<Product> catalog = new ArrayList<>();

        catalog.add(new Product("Rainbow shell bead necklace", 8.99, "product1.jpeg"));
        catalog.add(new Product("Light as a feather necklace", 9.99, "product2.jpeg"));
        catalog.add(new Product("Steeze skater ring", 6.99, "product3.jpeg"));
        catalog.add(new Product("Under the sea stacked bracelet", 7.99, "product4.jpeg"));
        catalog.add(new Product("Stacked ribbon earrings", 4.00, "product5.jpeg"));
        catalog.add(new Product("Rainbow shell bead bracelet", 5.00, "product6.jpeg"));

        return catalog;
    }

    /**
     * Displays each product in the catalog using its toString method.
     *
     * @param products the list of products to display
     */
    private static void displayProductCatalog(ArrayList<Product> products)
    {
        for (Product product: products) {
            System.out.println(product);
        }
    }
}
