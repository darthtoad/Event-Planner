
import java.util.ArrayList;
import java.util.Arrays;

public class EventPlanner {
    private int guests;
    private int price;
    private ArrayList<String> food;
    private ArrayList<String> entertainment;
    private ArrayList<String> beverages;
    //private ArrayList<String> coupons;
    public EventPlanner(int guests, ArrayList<String> food, ArrayList<String> entertainment, ArrayList<String> beverages/*, ArrayList<String> coupons*/) {
        this.guests = guests;
        this.food = food;
        this.beverages = beverages;
        this.price = 0;
        this.entertainment = entertainment;
        //this.coupons = coupons;
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
                this.price += 150;
            }
        }
        String [] alcoholic = {"whiskey"};
        String [] nonAlcholic = {"coke"};
        for (String item : beverages) {
            if (Arrays.asList(alcoholic).contains(item.toLowerCase())) {
                int numberToAdd = this.guests * 5;
                this.price += numberToAdd;
            }
            if (Arrays.asList(nonAlcholic).contains(item.toLowerCase())) {
                int numberToAdd = this.guests * 2;
                this.price += numberToAdd;
            }
        }
//        for (String coupon : coupons) {
//            if (coupon.toUpperCase().equals("DJ") && this.food.size() > 0 ) {
//                this.price -= 150;
//            }
//        }
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
    public ArrayList<String> getBeverages() {
        return this.beverages;
    }
}
