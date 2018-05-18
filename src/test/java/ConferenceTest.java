import Guests.Guest;
import org.junit.Before;
import org.junit.Test;
import roomType.Conference;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {
    Conference conference;
    Guest guest;

    @Before
    public void before (){
        conference = new Conference(10, "Islay Suite", 150.00);
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, conference.getCapacity());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, conference.getGuestListCount());
    }

    @Test
    public void hasName(){
        assertEquals("Islay Suite", conference.getName());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(150.00, conference.getDailyRate(), 0.01);
    }

    @Test
    public void canAddGuest(){
        conference.addGuest(guest);
        assertEquals(1, conference.getGuestListCount());
    }

    @Test
    public void canRemoveGuest(){
        conference.addGuest(guest);
        conference.removeGuest(guest);
        assertEquals(0, conference.getGuestListCount());
    }



}

