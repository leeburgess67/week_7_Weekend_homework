package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    double costPrice;
    double retaiPrice;

    public Guitar(String name, String colour, String material, boolean isElectric, InstrumentType instrumentType, double costPrice, double retaiPrice) {
        super(name, colour, material, isElectric, instrumentType);
        this.costPrice = costPrice;
        this.retaiPrice = retaiPrice;
    }

    @Override
    public String play() {
        return "I'm a geetawr";
    }

    @Override
    public double calculateMarkup() {
    return retaiPrice - costPrice;
    }

    @Override
    public double getCostPrice() {
        return this.costPrice;
    }

    @Override
    public double getRetailPrice() {
        return this.retaiPrice;
    }
}
