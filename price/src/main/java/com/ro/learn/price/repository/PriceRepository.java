package com.ro.learn.price.repository;

import com.ro.learn.price.bean.Price;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class PriceRepository {
    private Map<Integer, Price> prices;

    public PriceRepository() {
        prices = new HashMap<>(10);
        prices.put(1, new Price(1, 10));
        prices.put(2, new Price(2, 20));
        prices.put(3, new Price(3, 30));
        prices.put(4, new Price(4, 40));
        prices.put(5, new Price(5, 50));
        prices.put(6, new Price(6, 60));
        prices.put(7, new Price(7, 70));
        prices.put(8, new Price(8, 80));
    }

    public List<Price> getAll(){
        return new ArrayList<>(prices.values());
    }

    public Price get(int productId) {
        return prices.get(productId);
    }

}
