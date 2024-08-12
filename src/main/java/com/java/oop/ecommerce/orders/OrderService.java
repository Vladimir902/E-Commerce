package com.java.oop.ecommerce.orders;

import java.util.Scanner;

public class OrderService implements OrderManager {

    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();

    @Override
    public void ordering() {
        if (x > 0) {
            x = x + 1;
        }
        System.out.println("product is " + x);
    }
}
