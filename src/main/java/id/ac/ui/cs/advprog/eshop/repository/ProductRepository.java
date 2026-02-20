package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<product> productData = new ArrayList<>();

    public product create(product product) {
        productData.add(product);
        return product;
    }

    public Iterator<product> findAll() {
        return productData.iterator();
    }
}