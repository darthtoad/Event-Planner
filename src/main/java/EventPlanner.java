import java.util.ArrayList;

public class EventPlanner {
    private int guests;
    private int price;
    private ArrayList<String> food;
    private ArrayList<String> entertainment;
    public EventPlanner(int guests, ArrayList<String> food, ArrayList<String> entertainment) {
        this.guests = guests;
        this.food = food;
        this.price = 0;
        this.entertainment = entertainment;
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
        for (String item : entertainment) {
            if (item.toUpperCase().equals("DJ") || item.toLowerCase().equals("magician")) {
                this.price += 15;
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
    public ArrayList<String> getEntertainment() {
        return this.entertainment;
    }
}
