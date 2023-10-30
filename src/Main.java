import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Market marketNew = new Market();
        Human human1 = new Human("Alexandr");
        Human human2 = new Human("Sergei");
        Human human3 = new Human("Vasilii");
        marketNew.acceptToMarket(human1);
        marketNew.acceptToMarket(human2);
        marketNew.acceptToMarket(human3);
        marketNew.update();

        marketNew.releaseFromMarket(marketNew.releaseFromQueue());
    }
}

