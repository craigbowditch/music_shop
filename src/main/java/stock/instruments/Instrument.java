package stock.instruments;

import stock.Stock;

public abstract class Instrument extends Stock implements Playable{

    private String material;
    private String colour;
    private InstrumentType type;
    private String make;

    public Instrument(double buyingPrice, double sellingPrice, String material, String colour, InstrumentType type, String make) {
        super(buyingPrice, sellingPrice);
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.make = make;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getMake() {
        return make;
    }
}
