package com.pro.sky.HW11_spring.services;
import com.pro.sky.HW11_spring.products.Products;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;
@Component
@SessionScope
public class SelectedProducts {
   private Map<Integer, Products> bag = new HashMap<>();
   public Map<Integer, Products> getBag() {
        return bag;
    }
    public void setChart(Map<Integer, Products> bag) {
        this.bag= bag;
    }
}
