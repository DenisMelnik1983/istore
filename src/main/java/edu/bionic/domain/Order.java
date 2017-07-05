package edu.bionic.domain;

import com.google.common.collect.ImmutableList;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by c268 on 05.07.2017.
 */
public class Order {
    private LocalDateTime dateTime;
    private BigDecimal totalAmount;
    private List<Product> products;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Product> getProducts() {
        return ImmutableList.copyOf(products);
    }
//
//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }

    public void addProduct(Product product){
        products.add(product);
    }

   /// public void removePro
}
