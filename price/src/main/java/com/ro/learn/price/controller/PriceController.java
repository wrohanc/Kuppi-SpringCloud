package com.ro.learn.price.controller;

import com.ro.learn.price.bean.Price;
import com.ro.learn.price.repository.PriceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PriceController {
    private static Logger log = LoggerFactory.getLogger(PriceController.class);
    @Autowired
    private PriceRepository priceRepository;

    @GetMapping(path = "price/{productId}")
    public Price getPrice(@PathVariable int productId) {
        log.info("Serving price for product id: " + productId);
        return priceRepository.get(productId);
    }

    @GetMapping(path = "price")
    public List<Price> getPrice() {
        return priceRepository.getAll();
    }
}
