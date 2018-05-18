import Guests.Guest;
import org.junit.Before;
import org.junit.Test;
import roomType.Bedroom;
import roomType.BedroomType;
import roomType.Conference;
import roomType.Dining;

public class HotelTest {
    Bedroom bedroom;
    Dining dining;
    Conference conference;
    Guest guest;

    @Before
    public void before (){
        bedroom = new Bedroom(12, BedroomType.DOUBLE, 100.00);
        dining = new Dining (100);
        conference = new Conference (20, "The Dunbar Room", 150.00);
        guest = new Guest("Brad Pitt");
    }

    @Test
    public void canAddRoomToConferenceList(){
        conference.addconference()
        assertEquals()
    }

    private void assertEquals() {
    }
}
