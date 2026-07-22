package org.example;

import org.example.Data.Order;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FirstEx {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0),
                new Order("Headphones", 150.0),
                new Order("Laptop", 1100.0),
                new Order("Monitor", 400.0),
                new Order("Smartphone", 1000.0),
                new Order("Keyboard", 100.0),
                new Order("Tablet", 600.0),
                new Order("Mouse", 50.0),
                new Order("Laptop", 1700.0),
                new Order("Monitor", 350.0),
                new Order("Headphones", 200.0),
                new Order("Smartphone", 750.0),
                new Order("Laptop", 1300.0),
                new Order("Tablet", 450.0),
                new Order("Keyboard", 120.0),
                new Order("Monitor", 500.0)
        );


        Map<String, Double> products = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getProduct,
                        Collectors.summingDouble(Order::getCost))
                );

        Map<String, Double> productsSorted = products.entrySet().stream()
                .sorted(Comparator.comparingDouble((Map.Entry<String, Double> e) -> e.getValue()).reversed())
                .limit(3)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));


        System.out.println(productsSorted);

    }
}