import seminar1.BottleOfWaterVendingMachine;
import seminar1.BottleOfWatter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotDrink b1 = new HotDrink("1", 1, 1, 60);
        HotDrink b2 = new HotDrink("2", 2, 2, 35);
        HotDrink b3 = new HotDrink("5", 4, 3, 44);
        HotDrink b4 = new HotDrink("15", 123, 1, 33);
        HotDrink b5 = new HotDrink("20", 6, 5, 40);

        HotDrinkVendingMachine hotDrinkvendingMachine = new HotDrinkVendingMachine(new ArrayList<>());
        hotDrinkvendingMachine.addHotDrink(b1);
        hotDrinkvendingMachine.addHotDrink(b2);
        hotDrinkvendingMachine.addHotDrink(b3);
        hotDrinkvendingMachine.addHotDrink(b4);
        hotDrinkvendingMachine.addHotDrink(b5);
        System.out.println(hotDrinkvendingMachine.getProduct("20", 5, 40));

    }

}
