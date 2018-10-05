package instruments;

public class Saxophone extends Instrument {

    private String typeOfReed;

    public Saxophone(String material, String colour, InstrumentType type, String make, double buyingPrice, double sellingPrice, String typeOfReed) {
        super(material, colour, type, make, buyingPrice, sellingPrice);
        this.typeOfReed = typeOfReed;
    }

    public String getTypeOfReed() {
        return typeOfReed;
    }

    public String play(){
        return "Careless whisper eat your heart out";
    }
}
