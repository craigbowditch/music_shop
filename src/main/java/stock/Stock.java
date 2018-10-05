package stock;

public abstract class Stock implements Sellable {

    private double buyingPrice;
    private double sellingPrice;

    public Stock(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }
}
