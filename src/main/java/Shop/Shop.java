package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> products;

    public Shop(ArrayList<ISell> products){
        this.products = products;
    }

    public ArrayList<ISell> getProducts() {
        return products;
    }

    public void addStock(ISell item){
        products.add(item);
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



}
