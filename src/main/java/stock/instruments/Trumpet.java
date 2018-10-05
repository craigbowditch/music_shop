package stock.instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(double buyingPrice, double sellingPrice, String material, String colour, InstrumentType type, String make, int numberOfValves) {
        super(buyingPrice, sellingPrice, material, colour, type, make);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "Parp";
    }
}
