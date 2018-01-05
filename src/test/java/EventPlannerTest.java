import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
    @Test
    public void EventPlanner_instantiatesCorrectly() throws Exception {
        EventPlanner testEventPlanner = new EventPlanner(1);
        assertEquals(true, testEventPlanner instanceof EventPlanner);
    }
    @Test
    public void getGuests_returnsNumberOfGuests_20() throws Exception {
        EventPlanner testEventPlanner = new EventPlanner(20);
        assertEquals(20, testEventPlanner.getGuests());
    }
}