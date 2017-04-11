package org.fatecmvc.view;

import java.util.List;

import org.fatecmvc.model.Product;

/**
 * Created by mdsli on 28/03/2017.
 */
public interface Observer {
    public void updateSearch(List<Product> l);
    public void updateAdd(List<Product> l);
    public void updateDelete(List<Product> l);
}
