package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<ISell> basket;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.basket = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public ArrayList<ISell> getBasket() {
        return basket;
    }

    public void addToBasket(ISell item) {
        basket.add(item);
    }


    public void purchaseItem(ISell item, Shop shop) {
        if (wallet > item.getRetailPrice()) {
            addToBasket(item);
            shop.sellItem(item);

        }
    }
}




