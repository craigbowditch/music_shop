package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType type, String make, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(material, colour, type, make, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Jimi Hendrix screaming solo";
    }
}
