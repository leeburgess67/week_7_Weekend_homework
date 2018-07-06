package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> products;
    private double till;

    public Shop(ArrayList<ISell> products){
        this.products = products;
        this.till = 100.00;//opening float
    }

    public ArrayList<ISell> getProducts() {
        return products;
    }

    public void addStock(ISell item){
        products.add(item);
    }

    public double getTill() {
        return till;
    }

    public double getTotalValueAtCostPrice() {
        double costPriceTotal = 0.0;
        for (ISell product : products) {
            costPriceTotal += product.getCostPrice();
        }
        return costPriceTotal;
    }

    public double getTotalValueAtRetailPrice() {
        double retailPriceTotal = 0.0;
        for (ISell product : products) {
            retailPriceTotal += product.getRetailPrice();
        }
        return retailPriceTotal;
    }

    public double getTotalProfit(){
        return getTotalValueAtRetailPrice() - getTotalValueAtCostPrice();
    }

    public void sellItem(ISell item){
        till += item.getRetailPrice();
    }




    }




