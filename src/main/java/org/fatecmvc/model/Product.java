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
    private Calendar purchaseDate = Calendar.getInstance();
    private Double purchasePrice;
    private Double sellPrice = (this.purchasePrice * (this.profit/100)) + this.purchasePrice;
}
