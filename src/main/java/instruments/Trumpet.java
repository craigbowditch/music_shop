package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType type, String make, double buyingPrice, double sellingPrice, int numberOfValves) {
        super(material, colour, type, make, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "Parp";
    }
}
