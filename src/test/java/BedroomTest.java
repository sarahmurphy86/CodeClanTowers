import Guests.Guest;
import org.junit.Before;
import org.junit.Test;
import roomType.Bedroom;
import roomType.BedroomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before (){
        bedroom = new Bedroom(12, BedroomType.DOUBLE);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, bedroom.getGuestListCount());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(12, bedroom.getRoomNumber());
    }

    @Test
    public void hasBedRoomType(){
        assertEquals(BedroomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestListCount());
    }

}

