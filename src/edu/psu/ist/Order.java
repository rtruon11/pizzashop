package edu.psu.ist;

import java.util.ArrayList;

enum MenuMenu {Plain_Pizza, Pepperoni_Pizza, Extra_Cheese_Pizza, Veggie_Pizza}

public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;
    private MenuMenu menuItem;

    //Constructor Method
    public Order(int _orderId, Customer _cust, MenuMenu _menuItem){
        this.orderId = _orderId;
        this.cust = _cust;
        this.menuItem = _menuItem;
    }

    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public Customer getcust() { return cust; }
    public void setcust(Customer _cust) {this.cust = _cust;}

    public MenuMenu getmenuItem() { return menuItem; }
    public void setmenuItem(MenuMenu _menuItem) {this.menuItem = _menuItem;}

    public static void listOrder(ArrayList<Order> oList){
        for (Order order: oList){
            System.out.println("Order: " + order.getorderId());
            System.out.println("Customer Name: " + order.getcust());
            System.out.println("Items: " + order.getmenuItem());
        }
    }
}
