import java.util.ArrayList;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    ArrayList<Actor> releaseFromQueue();
}
