package edu.psu.ist;

import java.util.ArrayList;


public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private double menuPrice;

    //Constructor Method
    public Menu(int _menuId, String _menuItem, double _menuPrice){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.menuPrice = _menuPrice;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}

    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}

    public double getmenuPrice() { return menuPrice; }
    public void setmenuPrice(double _menuPrice) {this.menuPrice = _menuPrice;}

    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.print(menu.getmenuId() + ")");
            System.out.print(" " + menu.getmenuItem());
            System.out.println(" " + menu.getmenuPrice());
        }
    }
}