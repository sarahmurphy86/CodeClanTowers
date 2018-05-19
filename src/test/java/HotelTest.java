import Guests.Guest;
import Hotels.Hotel;
import org.junit.Before;
import org.junit.Test;
import roomType.Bedroom;
import roomType.BedroomType;
import roomType.Conference;
import roomType.Dining;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Dining dining;
    Conference conference;
    Guest guest;

    @Before
    public void before() {
        bedroom1 = new Bedroom(12, BedroomType.DOUBLE, 100.00);
        bedroom2 = new Bedroom(2, BedroomType.SINGLE, 50.00);
        dining = new Dining(100);
        conference = new Conference(20, "The Dunbar Room", 150.00);
        guest = new Guest("Brad Pitt");
        hotel = new Hotel();
    }

    @Test
    public void hasNoConferenceRooms() {
        assertEquals(0, hotel.getConferenceRoomListCount());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConference(conference);
        assertEquals(1, hotel.getConferenceRoomListCount());
    }

    @Test
    public void canAddDiningRoom() {
        hotel.addDining(dining);
        assertEquals(1, hotel.getDiningRoomListCount());
    }

    @Test
    public void canAddBedroom() {
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom);
        assertEquals(2, hotel.getBedroomListCount());
    }


}