
package com.pro.sky.HW11_spring.services;


import com.pro.sky.HW11_spring.products.Products;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service

public class ProductsService {

    private SelectedProducts selectedProducts;

    public ProductsService (SelectedProducts  selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public void add(String name) {

        Products products = new Products(name);

        selectedProducts.getBag().put(products.getId(),products);


    }

    public Map<Integer, Products> get() {

        Map<Integer, Products> bag = selectedProducts.getBag();

        return selectedProducts.getBag();


    }
}
