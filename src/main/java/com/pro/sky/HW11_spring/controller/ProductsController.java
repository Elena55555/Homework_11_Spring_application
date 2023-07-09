

package com.pro.sky.HW11_spring.controller;



import com.pro.sky.HW11_spring.products.Products;
import com.pro.sky.HW11_spring.services.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



@RestController


@RequestMapping("/store/order/")


public class ProductsController {

    private final ProductsService productsService;


    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }


    @GetMapping ("/add")

    public String add ( @RequestParam ("name") String name) {

        productsService.add(name);

        return "товар добавлен";

    }


    @GetMapping("/get")

    public Map<Integer, Products> get(){
        return productsService.get();
    }

}


