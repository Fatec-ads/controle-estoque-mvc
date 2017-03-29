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
}
