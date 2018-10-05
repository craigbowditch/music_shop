package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType type, String make, double buyingPrice, double sellingPrice, int numberOfKeys) {
        super(material, colour, type, make, buyingPrice, sellingPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "Bachesque wizardry";
    }
}
