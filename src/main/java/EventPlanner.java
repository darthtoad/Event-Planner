
import java.util.ArrayList;
import java.util.Arrays;

public class EventPlanner {
    private Integer guests;
    private int price;
    private ArrayList<String> food;
    private ArrayList<String> entertainment;
    private ArrayList<String> beverages;
    private ArrayList<String> coupons;
    public EventPlanner(Integer guests, ArrayList<String> food, ArrayList<String> entertainment, ArrayList<String> beverages, ArrayList<String> coupons) {
        this.guests = guests;
        this.food = food;
        this.beverages = beverages;
        this.price = 0;
        this.entertainment = entertainment;
        this.coupons = coupons;
        this.price += this.guests;
        for (String item : food) {
            if (item.toLowerCase().equals("pizza") || item.toLowerCase().equals("breakfast")) {
                int pizzaToAdd = this.guests * 5;
                this.price += pizzaToAdd;
            }
            if (item.toLowerCase().equals("cake")) {
                int cakeToAdd = this.guests * 3;
                this.price += cakeToAdd;
            }
            if (item.toLowerCase().equals("sushi")) {
                int sushiToAdd = this.guests * 7;
                this.price += sushiToAdd;
            }
            if (item.toLowerCase().equals("tacos")) {
                int tacosToAdd = this.guests * 4;
                this.price += tacosToAdd;
            }
        }
        for (String item : entertainment) {
            if (item.toUpperCase().equals("DJ") || item.toLowerCase().equals("magician")) {
                this.price += 150;
            }
            if (item.toLowerCase().equals("band")) {
                this.price += 300;
            }
        }
        String [] alcoholic = {"whiskey", "rum", "tequila", "beer", "vodka"};
        String [] nonAlcholic = {"coke", "juice"};
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
        for (String coupon : coupons) {
            if (coupon.toUpperCase().equals("DJ") && this.food.size() > 0 && this.beverages.size() > 0 && this.guests >= 150) {
                this.price -= 150;
            }
            if (coupon.toLowerCase().equals("band") && this.food.size() > 1 && this.beverages.size() > 1 && this.guests >= 300) {
                this.price -= 300;
            }
            if (coupon.toLowerCase().equals("$50off")) {
                this.price -= 50;
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
    public ArrayList<String> getBeverages() {
        return this.beverages;
    }
    public ArrayList<String> getCoupons() {
        return this.coupons;
    }
}
