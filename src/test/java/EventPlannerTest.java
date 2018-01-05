import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class EventPlannerTest {
    @Test
    public void EventPlanner_instantiatesCorrectly() throws Exception {
        ArrayList<String> food = new ArrayList<String>();
        EventPlanner testEventPlanner = new EventPlanner(1, food);
        assertEquals(true, testEventPlanner instanceof EventPlanner);
    }
    @Test
    public void getGuests_returnsNumberOfGuests_20() throws Exception {
        ArrayList<String> food = new ArrayList<String>();
        EventPlanner testEventPlanner = new EventPlanner(20, food);
        assertEquals(20, testEventPlanner.getGuests());
    }
    @Test
    public void getPrice_returnPriceAfterGuestsEntered_20() throws Exception {
        ArrayList<String> food = new ArrayList<String>();
        EventPlanner testEventPlanner = new EventPlanner(20, food);
        assertEquals(20, testEventPlanner.getPrice());
    }
    @Test
    public void getFood_returnFoodGiven_PizzaCake() throws Exception {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cake");
        EventPlanner testEventPlanner = new EventPlanner(20, food);
        assertEquals(food, testEventPlanner.getFood());
    }
    @Test
    public void getPrice_returnPriceAfterFoodEntered_100() throws Exception {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Cake");
        EventPlanner testEventPlanner = new EventPlanner(20, food);
        assertEquals(100, testEventPlanner.getPrice());
    }
}