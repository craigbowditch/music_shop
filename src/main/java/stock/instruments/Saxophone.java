package stock.instruments;

public class Saxophone extends Instrument {

    private String typeOfReed;

    public Saxophone(double buyingPrice, double sellingPrice, String material, String colour, InstrumentType type, String make, String typeOfReed) {
        super(buyingPrice, sellingPrice, material, colour, type, make);
        this.typeOfReed = typeOfReed;
    }

    public String getTypeOfReed() {
        return typeOfReed;
    }

    public String play(){
        return "Careless whisper eat your heart out";
    }
}
