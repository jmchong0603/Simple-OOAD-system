/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UX_gallery;

import java.io.Serializable;

public class Inventory implements Serializable{
    
    private String inventoryId;
    private String artist;
    private String title;
    private String description;
    private double purchasePrice;
    private double sellingPrice;
    private int stock; //stock available

    public Inventory(String inventoryId, String artist, String title, String description, double purchasePrice, double sellingPrice, int stock) {
        
        this.inventoryId = inventoryId;
        this.artist = artist;
        this.title = title;
        this.description= description;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.stock = stock;
    }

    public String getInventoryId()
    {
        return inventoryId;
    }
    
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
    
    public String getDescription(){
        return description;
    }
    
    public int getStock(){
        return stock;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
    
    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public String toStringForStaff() {
       return inventoryId + "//" + artist + "//" + title + "//" + description + "//" + purchasePrice  + "//" + sellingPrice  + "//" + stock;
    }
    
    public String toStringForCustomer() {
        return "\tArt ID : " + inventoryId + "\n\tArtist : " + artist + "\n\tTitle : " + title + "\n\tDescription : " + description + "\n\tPrice : " + sellingPrice  + "\n\tStock Available : " + stock + "\n";
    }


}