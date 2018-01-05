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
        for (String item : food) {
            if (item.toLowerCase().equals("pizza")) {
                int pizzaToAdd = this.guests * 5;
                this.price += pizzaToAdd;
            }
            if (item.toLowerCase().equals("cake")) {
                int cakeToAdd = this.guests * 3;
                this.price += cakeToAdd;
            }
        }
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
