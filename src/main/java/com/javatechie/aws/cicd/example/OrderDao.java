package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders() {
        return Stream.of(
                new Order(101, "Mobiles", 1, 60000),
                new Order(58, "Book", 4, 4000),
                new Order(205, "Laptop", 1, 170000),
                new Order(809, "headset", 1, 1999))
                .collect(Collectors.toList());
    }
}
