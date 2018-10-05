package stock.accessories;

import stock.Sellable;
import stock.Stock;

public abstract class Accessory extends Stock{

    private String type;
    private String make;

    public Accessory(double buyingPrice, double sellingPrice, String type, String make) {
        super(buyingPrice, sellingPrice);
        this.type = type;
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }
}
