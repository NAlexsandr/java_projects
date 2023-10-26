import seminar1.BottleOfWatter;

public class HotDrink extends BottleOfWatter {
    private int temperature;

    public HotDrink(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;

    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "HotDrink {" + " Имя " + super.getName() + " Стоимость " + super.getCost() +
                " temperature=" + temperature + '}';
    }
}