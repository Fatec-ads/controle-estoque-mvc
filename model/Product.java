package org.fatecmvc.model;

import lombok.Data;

import java.util.Calendar;

/**
 * @author Marcelo Lino
 */

@Data
public class Product {
    private static Calendar lastSellDate;
    private String name;
    private String description;
    private String type;
    private Double profit;
    private Integer quantity;
    private Calendar purchaseDate;
    private Double purchasePrice;
    private Double sellPrice;

    
    /**
     * 
     * @param name
     * @param description
     * @param type
     * @param profit
     * @param quantity
     * @param purchasePrice
     */
    public Product(String name, String description, String type, Double profit, Integer quantity, Double purchasePrice){
    	this.name = name;
    	this.description = description;
    	this.type = type;
    	this.profit = profit;
    	this.quantity = quantity;
    	this.purchaseDate = Calendar.getInstance();
    	this.purchasePrice = purchasePrice;
    	this.sellPrice = (purchasePrice * (profit/100)) + purchasePrice;
    	
    }
}
