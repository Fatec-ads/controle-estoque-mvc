package org.fatecmvc.model;

import org.fatecmvc.view.Observer;

import java.util.List;

/**
 * Created by mdsli on 28/03/2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void notifyObservers(List<Product> encontrados);
    public void removeObserver(Observer o);
}
