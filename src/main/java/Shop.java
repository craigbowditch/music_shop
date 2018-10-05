import stock.Sellable;
import stock.accessories.Tuner;
import stock.instruments.Piano;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Sellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void add(Sellable item) {
        this.stock.add(item);
    }

    public void remove(Sellable soldItem) {
        Sellable itemToRemove = null;
        for (Sellable item : this.stock){
            if (item == soldItem){
                itemToRemove = item;
            }
        }
        this.stock.remove(itemToRemove);
    }

    public double calculateTotalPotentialProfit() {
        double profit = 0.00;
        for (Sellable item : this.stock){
            double itemProfit = item.calculateMarkup();
            profit += itemProfit;
        }
        return profit;
    }
}
