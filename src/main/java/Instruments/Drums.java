package Instruments;

import Instruments.ENUMS.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Drums extends Instrument implements IPlay, ISell {

    double costPrice;
    double retailPrice;

    public Drums(String name, String colour, String material, boolean isElectric, InstrumentType instrumentType, double costPrice, double retailPrice) {
        super(name, colour, material, isElectric, instrumentType);
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String play() {
        return "Bish Bosh, Ting";
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
