
import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
   private final List<Actor> gueue;
   private final List<Actor> readytogo;

       public Market(){
        this.gueue = new ArrayList<>();
        this.readytogo = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + "зашел в магазин");
        takeInQueue(actor);
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: actors){
            System.out.println(actor.getName() + " вышел из магазина");
            gueue.remove(actor);
        }
    }
    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
    @Override
    public void takeInQueue(Actor actor) {
        gueue.add(actor);
        System.out.println(actor.getName() + "встал в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : gueue) {
            if (!actor.isTakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : gueue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public ArrayList<Actor> releaseFromQueue() {
        for (Actor actor : gueue) {
            if (actor.isMakeOrder()) {
                System.out.println(actor.getName() + " вышел из очереди и скоро выйдет из магазина");
                readytogo.add(actor);
            }
        }
        return (ArrayList<Actor>) readytogo;
    }
}