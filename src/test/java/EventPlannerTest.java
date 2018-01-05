import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
    @Test
    public void EventPlanner_instantiatesCorrectly() throws Exception {
        EventPlanner testEventPlanner = new EventPlanner();
        assertEquals(true, testEventPlanner instanceof EventPlanner);
    }

}