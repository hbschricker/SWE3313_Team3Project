import java.util.ArrayList;

public class storeInventory {
    private int id;
    private String name;
    private String description;
    private double unitPrice;
    private int quantityInStock;

    /**
     * Takes in the information about the items and assigns the values to the attributes
     * @param id
     * @param name
     * @param description
     * @param unitPrice
     * @param quantityInStock
     */

    public storeInventory(int id, String name, String description, double unitPrice, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
    }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public int getId() {
        return id;
    }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public String getName() {
        return name;
    }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public String getDescription() {
        return description;
    }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public double getUnitPrice() {
        return unitPrice;
    }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public int getQuantityInStock() {
        return quantityInStock;
    }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public double getInventoryValue() {
        return unitPrice * quantityInStock;
    }

    /**
     * Creates an array to store the store inventory
     * @param args
     */
    public static void main (String[]args){
        ArrayList<storeInventory> inventoryList = new ArrayList<>();

        // Adding sample StoreInventory objects to the ArrayList
        inventoryList.add(new storeInventory(1001, "Sky Hoop Blue Ring", "Ring", 7.99, 10));
        inventoryList.add(new storeInventory(1002, "Steeze Skater Ring", "Ring", 6.99, 15));
        inventoryList.add(new storeInventory(1003, "Rainbow Shell Bead Necklace", "Necklace", 8.99, 20));
    }
}
