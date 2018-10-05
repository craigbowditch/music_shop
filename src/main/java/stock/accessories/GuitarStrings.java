package stock.accessories;

public class GuitarStrings extends Accessory {

    private String gauge;

    public GuitarStrings(double buyingPrice, double sellingPrice, String type, String make, String gauge) {
        super(buyingPrice, sellingPrice, type, make);
        this.gauge = gauge;
    }

    public String getGauge() {
        return gauge;
    }
}
