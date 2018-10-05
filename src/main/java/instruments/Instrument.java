package instruments;

public abstract class Instrument {

    private String material;
    private String colour;
    private InstrumentType type;
    private String make;

    public Instrument(String material, String colour, InstrumentType type, String make) {
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
