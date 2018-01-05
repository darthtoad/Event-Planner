import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class EventPlannerTest {
    @Test
    public void EventPlanner_instantiatesCorrectly() throws Exception {
        ArrayList<String> coupons = new ArrayList<String>();
        ArrayList<String> beverages = new ArrayList<String>();
        ArrayList<String> entertainment = new ArrayList<String>();
        ArrayList<String> food = new ArrayList<String>();
        EventPlanner testEventPlanner = new EventPlanner(1, food, entertainment, beverages, coupons);
        assertEquals(true, testEventPlanner instanceof EventPlanner);
    }
    @Test
    public void getGuests_returnsNumberOfGuests_20() throws Exception {
        ArrayList<String> coupons = new ArrayList<String>();
        ArrayList<String> beverages = new ArrayList<String>();
        ArrayList<String> entertainment = new ArrayList<String>();
        ArrayList<String> food = new ArrayList<String>();
        EventPlanner testEventPlanner = new EventPlanner(20, food, entertainment, beverages, coupons);
        assertEquals(20, testEventPlanner.getGuests());
    }
    @Test
    public void getPrice_returnPriceAfterGuestsEntered_20() throws Exception {
        ArrayList<String> coupons = new ArrayList<String>();
        ArrayList<String> beverages = new ArrayList<String>();
        ArrayList<String> entertainment = new ArrayList<String>();
        ArrayList<String> food = new ArrayList<String>();
        EventPlanner testEventPlanner = new EventPlanner(20, food, entertainment, beverages, coupons);
        assertEquals(20, testEventPlanner.getPrice());
    }
    @Test
    public void getFood_returnFoodGiven_ArrayList() throws Exception {
        ArrayList<String> coupons = new ArrayList<String>();
        ArrayList<String> beverages = new ArrayList<String>();
        ArrayList<String> entertainment = new ArrayList<String>();
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cake");
        EventPlanner testEventPlanner = new EventPlanner(20, food, entertainment, beverages, coupons);
        assertEquals(food, testEventPlanner.getFood());
    }
    @Test
    public void getPrice_returnPriceAfterFoodEntered_180() throws Exception {
        ArrayList<String> coupons = new ArrayList<String>();
        ArrayList<String> beverages = new ArrayList<String>();
        ArrayList<String> entertainment = new ArrayList<String>();
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cake");
        EventPlanner testEventPlanner = new EventPlanner(20, food, entertainment, beverages, coupons);
        assertEquals(180, testEventPlanner.getPrice());
    }
    @Test
    public void getEntertainment_returnEntertainmentGiven_ArrayList() throws Exception {
        ArrayList<String> coupons = new ArrayList<String>();
        ArrayList<String> beverages = new ArrayList<String>();
        ArrayList<String> entertainment = new ArrayList<String>();
        entertainment.add("DJ");
        entertainment.add("Magician");
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cake");
        EventPlanner testEventPlanner = new EventPlanner(20, food, entertainment, beverages, coupons);
        assertEquals(entertainment, testEventPlanner.getEntertainment());
    }
    @Test
    public void getPrice_returnPriceAfterEntertainmentEntered_480() throws Exception {
        ArrayList<String> coupons = new ArrayList<String>();
        ArrayList<String> beverages = new ArrayList<String>();
        ArrayList<String> entertainment = new ArrayList<String>();
        entertainment.add("DJ");
        entertainment.add("Magician");
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cake");
        EventPlanner testEventPlanner = new EventPlanner(20, food, entertainment, beverages, coupons);
        assertEquals(480, testEventPlanner.getPrice());
    }
    @Test
    public void getBeverages_returnBeveragesGiven_ArrayList() throws Exception {
        ArrayList<String> coupons = new ArrayList<String>();
        ArrayList<String> beverages = new ArrayList<String>();
        beverages.add("Coke");
        beverages.add("Whiskey");
        ArrayList<String> entertainment = new ArrayList<String>();
        entertainment.add("DJ");
        entertainment.add("Magician");
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cake");
        EventPlanner testEventPlanner = new EventPlanner(20, food, entertainment, beverages, coupons);
        assertEquals(beverages, testEventPlanner.getBeverages());
    }

    @Test
    public void getPrice_returnPriceAfterBeveragesEntered_620() throws Exception {
        ArrayList<String> coupons = new ArrayList<String>();
        ArrayList<String> beverages = new ArrayList<String>();
        beverages.add("Coke");
        beverages.add("Whiskey");
        ArrayList<String> entertainment = new ArrayList<String>();
        entertainment.add("DJ");
        entertainment.add("Magician");
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cake");
        EventPlanner testEventPlanner = new EventPlanner(20, food, entertainment, beverages, coupons);
        assertEquals(620, testEventPlanner.getPrice());
    }

    @Test
    public void getPrice_returnPriceAfterCouponsApplied_2500() throws Exception {
        ArrayList<String> beverages = new ArrayList<String>();
        beverages.add("Coke");
        beverages.add("Whiskey");
        ArrayList<String> entertainment = new ArrayList<String>();
        entertainment.add("DJ");
        entertainment.add("Magician");
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cake");
        ArrayList<String> coupons = new ArrayList<String>();
        coupons.add("DJ");
        coupons.add("$50 off");
        EventPlanner testEventPlanner = new EventPlanner(150, food, entertainment, beverages, coupons);
        assertEquals(2500, testEventPlanner.getPrice());
    }
}