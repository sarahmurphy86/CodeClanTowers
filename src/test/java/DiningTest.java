import Guests.Guest;
import org.junit.Before;
import org.junit.Test;
import roomType.Dining;

import static org.junit.Assert.assertEquals;


public class DiningTest{
    Dining dining;
    Guest guest;

    @Before
    public void before(){
        dining = new Dining (100);
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, dining.getCapacity());
    }

    @Test
    public void hasNoGuests(){
        assertEquals(0, dining.getGuestListCount());
    }


    @Test
    public void canAddGuest(){
       dining.addGuest(guest);
        assertEquals(1, dining.getGuestListCount());
    }

    @Test
    public void canRemoveGuest(){
        dining.addGuest(guest);
        dining.removeGuest(guest);
        assertEquals(0, dining.getGuestListCount());
    }
}
