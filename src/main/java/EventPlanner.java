import java.util.ArrayList;

public class EventPlanner {
    private int guests;
    private int price;
    private ArrayList<String> food;
    public EventPlanner(int guests, ArrayList<String> food) {
        this.guests = guests;
        this.food = food;
        this.price = 0;
        this.price += this.guests;

    }
    public int getGuests() {
        return this.guests;
    }
    public int getPrice() {
        return this.price;
    }
    public ArrayList<String> getFood() {
        return this.food;
    }
}
