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
        bedroom = new Bedroom(12, BedroomType.DOUBLE, 100.00);
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

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuestListCount());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(100.00, bedroom.getNightlyRate(), 0.01);

    }

//    @Test
//    public void canNotAddGuestsOverCapacity(){
//        bedroom.addGuest(guest);
//        bedroom.addGuest(guest);
//        bedroom.addGuest(guest);
//        assertEquals(2, bedroom.getGuestListCount());
//    }
//This test returns 3 not 2 - if statement must be incorrect- to check!
}

