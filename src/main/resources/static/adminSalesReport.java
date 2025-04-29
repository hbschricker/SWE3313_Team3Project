import java.io.*;
import java.util.*;

public class adminSalesReport {
        private String date;
        private int inventoryId;
        private String itemName;
        private String itemDescription;
        private double unitPrice;
        private int quantityInStock;
        private double taxRate;


    /**
     * Assigns values to the private attributes from the sales information
     * @param date
     * @param inventoryId
     * @param itemName
     * @param itemDescription
     * @param unitPrice
     * @param quantityInStock
     * @param taxRate
     */
        public adminSalesReport(String date, int inventoryId, String itemName, String itemDescription, double unitPrice, int quantityInStock, double taxRate) {
            this.date = date;
            this.inventoryId = inventoryId;
            this.itemName = itemName;
            this.itemDescription = itemDescription;
            this.unitPrice = unitPrice;
            this.quantityInStock = quantityInStock;
            this.taxRate = taxRate;
        }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public String getDate() {
        return date;
    }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public int getInventoryId() {
        return inventoryId;
    }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public String getItemName() {
        return itemName;
    }


    /**
     * gets the value of the private attribute and returns it
     * @return
     */
    public String getItemDescription() {
        return itemDescription;
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
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * saves the sales report information at an array list
     * @param args
     */
    public static void main (String[]args){
            ArrayList<adminSalesReport> salesReportList = new ArrayList<>();

            // Adding sample AdminSalesReport objects to the ArrayList
            salesReportList.add(new adminSalesReport("04/06/2025", 1001, "Sky Hoop Blue Ring", "Ring", 7.99, 1, 0.06));
            salesReportList.add(new adminSalesReport("04/06/2025", 1000, "Steeze Skater Ring", "Ring", 6.99, 1, 0.06));
            salesReportList.add(new adminSalesReport("04/07/2025", 1002, "Rainbow Shell Bead Necklace", "Necklace", 8.99, 1, 0.06));

        }

}
