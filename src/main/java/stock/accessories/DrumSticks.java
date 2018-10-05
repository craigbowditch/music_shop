package stock.accessories;

public class DrumSticks extends Accessory {

    private String material;

    public DrumSticks(double buyingPrice, double sellingPrice, String type, String make, String material) {
        super(buyingPrice, sellingPrice, type, make);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

}
