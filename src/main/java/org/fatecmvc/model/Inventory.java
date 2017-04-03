package org.fatecmvc.model;

import org.fatecmvc.view.Observer;

import java.util.LinkedList;
import java.util.List;

public class Inventory implements Subject{
    private List<Product> productList;
    private List<Observer> observerList;

    public Inventory(){
        productList = new LinkedList<Product>();
        observerList = new LinkedList<Observer>();
    }

    public void registerObserver(Observer o) {
        observerList.add(o);

    }

    public void notifyObservers(List<Product> encontrados) {
        for (Observer i: observerList){
            Observer ob = i;
            ob.update(encontrados);
        }

    }

    public void removeObserver(Observer o) {
        observerList.remove(o);

    }

    public void addProduct(Product p){
        productList.add(p);
    }

    public void searchProduct(Product p){
        List<Product> encontrados = new LinkedList<Product>();
        for (Product i: productList){
            Product productInventory = i;
            if (productInventory.equals(p)) encontrados.add(p);
        }
        notifyObservers(encontrados);
    }
}
