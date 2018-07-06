package Accessories;

import Interfaces.ISell;

public class GuitarStrings implements ISell {

    double costPrice;
    double retailPrice;
    String description;


    public GuitarStrings(String description,double costPrice, double retailPrice){
        this.description = description;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public double calculateMarkup() {
        return retailPrice - costPrice;
    }

    @Override
    public double getCostPrice() {
        return this.costPrice;
    }

    @Override
    public double getRetailPrice() {
        return this.retailPrice;
    }
}
