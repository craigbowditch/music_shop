package instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType type, String make, int numberOfKeys) {
        super(material, colour, type, make);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "Bachesque wizardry";
    }
}
