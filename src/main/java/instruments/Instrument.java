package instruments;

public abstract class Instrument implements Playable {

    private String material;
    private String colour;
    private InstrumentType type;
    private String make;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String material, String colour, InstrumentType type, String make, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.make = make;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
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

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
