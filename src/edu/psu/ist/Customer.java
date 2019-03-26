package edu.psu.ist;

import java.util.ArrayList;

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    private String customerName;
    private String customerPhone;

    //Constructor Method
    public Customer(int _customerId, String _customerName, String _customerPhone){
        this.customerId = _customerId;
        this.customerName = _customerName;
        this.customerPhone = _customerPhone;
    }

    //Setters and Getters
    public int getcustomerId() { return customerId; }
    public void setcustomerId(int _customerId) {this.customerId = _customerId;}

    public String getcustomerName() { return customerName; }
    public void setcustomerName(String _customerName) {this.customerName = _customerName;}

    public String getcustomerPhone() { return customerPhone; }
    public void setcustomerPhone(String _customerPhone) {this.customerPhone = _customerPhone;}

    public static void listCustomer(ArrayList<Customer> cList){
        for (Customer customer: cList){
            System.out.print(customer.getcustomerId() + "....");
            System.out.print(" " + customer.getcustomerName());
            System.out.println(" " + customer.getcustomerPhone());
        }
    }
}
