package Instruments;

public abstract class Instrument {

    private String name;
    private String colour;
    private String material;
    private boolean isElectric;
    private InstrumentType instrumentType;
    ;


    public Instrument(String name, String colour, String material, boolean isElectric, InstrumentType instrumentType){
        this.name = name;
        this.colour = colour;
        this.material = material;
        this.instrumentType = instrumentType;
        this.isElectric = isElectric;
    }

    public String getName() {
        return this.name;
    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public String getColour() {
        return this.colour;
    }

    public String getMaterial() {
        return this.material;
    }

    public boolean isElectric() {
        return this.isElectric;
    }




}