/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UX_gallery;

import java.io.Serializable;


public class Receipt implements Serializable{
    
    private String receiptId;
    private String customerId;
    private String inventoryId;
    private double purchasePrice;
    private double sellingPrice;
    private String date;
    
    public Receipt(String receiptId, String customerId, String inventoryId, double purchasePrice, double sellingPrice, String date)
    {
        this.receiptId = receiptId;
        this.customerId = customerId;
        this.inventoryId = inventoryId;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.date = date;         
    }
    
    public String getReceiptId()
    {
        return receiptId;
    }
    public String getCustomerId()
    {
        return customerId;
    }
    public String getInventoryId()
    {
        return inventoryId;
    }
    public double getPurchasePrice()
    {
        return purchasePrice;
    }
    public double getSellingPrice()
    {
        return sellingPrice;
    }
    public String getDate()
    {
        return date;
    }
    
    public String toStringForCustomer()
    {
        return "Receipt ID : " + receiptId + "\nInventory ID : " + inventoryId + "\nTotal paid : RM " + getSellingPrice() + "\nDate : " + getDate()  ; 
    }
    
    public String toStringForStaff()
    {
        return receiptId + "//" + inventoryId + "//" +  customerId + "//" + purchasePrice+ "//" +sellingPrice + "//" + date ; 
    }
}
