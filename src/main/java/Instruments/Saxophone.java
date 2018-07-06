package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {

    double costPrice;
    double retailPrice;

    public Saxophone(String name, String colour, String material, boolean isElectric, InstrumentType instrumentType, double costPrice, double retailPrice) {
        super(name, colour, material, isElectric, instrumentType);
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String play() {
        return "Baker Street";
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
