package edu.psu.ist;
/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Richard Truong
Date Developed: 3/14/19
Last Date Changed: 3/17/19
Rev: 2
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    int cCount = 1;
    public static void main(String[] args) {

        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char MENU_CODE = 'M';
        final char ORDE_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char HELP_CODE = '?';
        char userAction;
        final String PROMPT_ACTION = "Add 'C'ustomer, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Menu> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();

        Customer cust1 = new Customer(1, "Joe Oakes", "286-153-7945");
        cust1.setcustomerId(1);
        cust1.setcustomerName("Joe Oakes");
        cust1.setcustomerPhone("286-153-7945");
        Customer cust2 = new Customer(2, "Joe Oakes", "215-446-1234");
        cust2.setcustomerId(2);
        cust2.setcustomerName("Jeff Oakes");
        cust2.setcustomerPhone("215-446-1234");
        Customer cust3 = new Customer(3, "Joe Oakes", "262-845-1244");
        cust3.setcustomerId(3);
        cust3.setcustomerName("Jan Oakes");
        cust3.setcustomerPhone("262-845-1244");
        Customer cust4 = new Customer(4, "Joe Oakes", "652-954-7824");
        cust4.setcustomerId(4);
        cust4.setcustomerName("Jenny Oakes");
        cust4.setcustomerPhone("652-954-7824");

        Order order1 = new Order(101, cust1, MenuMenu.Plain_Pizza);
        order1.setorderId(101);
        order1.setcust(cust1);
        order1.setmenuItem(MenuMenu.Plain_Pizza);
        Order order2 = new Order(102, cust2, MenuMenu.Pepperoni_Pizza);
        order2.setorderId(102);
        order2.setcust(cust2);
        order2.setmenuItem(MenuMenu.Pepperoni_Pizza);
        Order order3 = new Order(103, cust3, MenuMenu.Extra_Cheese_Pizza);
        order3.setorderId(103);
        order3.setcust(cust3);
        order3.setmenuItem(MenuMenu.Extra_Cheese_Pizza);
        Order order4 = new Order(104, cust4, MenuMenu.Veggie_Pizza);
        order4.setorderId(104);
        order4.setcust(cust4);
        order4.setmenuItem(MenuMenu.Veggie_Pizza);

        Transaction trans1 = new Transaction(1, order1, PaymentType.cash);
        trans1.setTransactionId(1);
        trans1.setOrder(order1);
        trans1.setPaymentType(PaymentType.cash);
        Transaction trans2 = new Transaction(2, order2, PaymentType.credit);
        trans2.setTransactionId(2);
        trans2.setOrder(order2);
        trans2.setPaymentType(PaymentType.credit);
        Transaction trans3 = new Transaction(3, order3, PaymentType.credit);
        trans3.setTransactionId(3);
        trans3.setOrder(order3);
        trans3.setPaymentType(PaymentType.credit);
        Transaction trans4 = new Transaction(4, order4, PaymentType.credit);
        trans4.setTransactionId(4);
        trans4.setOrder(order4);
        trans4.setPaymentType(PaymentType.credit);

        Menu menu1 = new Menu(1, "Plain Pizza", 10.99);
        menu1.setmenuId(1);
        menu1.setmenuItem("Plain Pizza");
        menu1.setmenuPrice(10.99);
        Menu menu2 = new Menu(2, "Pepperoni Pizza", 12.99);
        menu2.setmenuId(2);
        menu2.setmenuItem("Pepperoni Pizza");
        menu2.setmenuPrice(12.99);
        Menu menu3 = new Menu(3, "Extra Cheese Pizza", 12.99);
        menu3.setmenuId(3);
        menu3.setmenuItem("Extra Cheese Pizza");
        menu3.setmenuPrice(12.99);
        Menu menu4 = new Menu(4, "Veggie Pizza", 15.99);
        menu4.setmenuId(4);
        menu4.setmenuItem("Veggie Pizza");
        menu4.setmenuPrice(15.99);

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);

        cList.add(cust1);
        cList.add(cust2);
        cList.add(cust3);
        cList.add(cust4);

        oList.add(order1);
        oList.add(order2);
        oList.add(order3);
        oList.add(order4);

        tList.add(trans1);
        tList.add(trans2);
        tList.add(trans3);
        tList.add(trans4);

        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch(userAction) {
                case CUST_CODE : cList.add(main.addCustomer());
                    break;
                case CUST_PRNT : Customer.printCustomer(cList);
                    break;
                case MENU_CODE : Menu.listMenu(mList);
                    break;
                case ORDE_CODE : Order.listOrder(oList);
                    break;
                case TRAN_CODE : Transaction.listTransactions(tList);
                    break;
            }
            userAction = getAction(PROMPT_ACTION);
        }
    }

    public Customer addCustomer() {
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhoneNumber(scnr.nextLine());
        return cust;
    }


    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println("");
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }
}