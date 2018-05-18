import Guests.Guest;
import org.junit.Before;
import roomType.Bedroom;
import roomType.BedroomType;
import roomType.Dining;

public class HotelTest {
    Bedroom bedroom;
    Dining dining;
    Guest guest;

    @Before
    public void before (){
        bedroom = new Bedroom(12, BedroomType.DOUBLE, 100.00);
        dining = new Dining (100);
    }
}
