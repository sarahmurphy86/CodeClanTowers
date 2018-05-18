import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Brad Pitt");
    }
    @Test
    public void canGetName(){
        assertEquals("Brad Pitt", guest.getName());
    }
}
