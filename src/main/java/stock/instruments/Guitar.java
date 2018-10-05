package stock.instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(double buyingPrice, double sellingPrice, String material, String colour, InstrumentType type, String make, int numberOfStrings) {
        super(buyingPrice, sellingPrice, material, colour, type, make);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Jimi Hendrix screaming solo";
    }
}
