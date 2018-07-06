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


}
