
import seminar1.BottleOfWatter;
import seminar1.Product;
import seminar1.VendingMachine;

import java.util.List;


public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> hotDrink;

    public HotDrinkVendingMachine(List<HotDrink> hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public Product getProduct(String name) {
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        return null;
    }
    public Product getProduct(String name, double volume, int temperature) {

        for (HotDrink item: hotDrink){
            if (item.getName().equals(name) && item.getVolume() == volume && item.getTemperature() == temperature)
                return item;
        }
        return null;
    }
    public void addHotDrink(HotDrink hotDrink){
        this.hotDrink.add(hotDrink);
    }
}

